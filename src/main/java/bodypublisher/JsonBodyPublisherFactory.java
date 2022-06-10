package bodypublisher;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.http.HttpRequest;
import java.util.Map;

public class JsonBodyPublisherFactory implements BodyPublisherFactory {

    @Override
    public String getContentTypeHeader() {
        return "application/json";
    }

    @Override
    public HttpRequest.BodyPublisher createBodyPublisher(Map<?, ?> data) {
        try {
            String json = new ObjectMapper().writeValueAsString(data);
            return HttpRequest.BodyPublishers.ofString(json);
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
