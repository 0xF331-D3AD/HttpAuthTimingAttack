package bodypublisher;

import java.net.URLEncoder;
import java.net.http.HttpRequest;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class FormDataBodyPublisherFactory implements BodyPublisherFactory {
    @Override
    public String getContentTypeHeader() {
        return "application/x-www-form-urlencoded";
    }

    @Override
    public HttpRequest.BodyPublisher createBodyPublisher(Map<?, ?> data) {
        var builder = new StringBuilder();
        for (Map.Entry<?, ?> entry : data.entrySet()) {
            if (builder.length() > 0) {
                builder.append("&");
            }
            builder.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
            builder.append("=");
            builder.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
        }
        return HttpRequest.BodyPublishers.ofString(builder.toString());
    }
}
