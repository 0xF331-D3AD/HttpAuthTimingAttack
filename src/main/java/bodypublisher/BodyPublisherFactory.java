package bodypublisher;

import java.net.http.HttpRequest;
import java.util.Map;

public interface BodyPublisherFactory {

    String getContentTypeHeader();

    HttpRequest.BodyPublisher createBodyPublisher(Map<?, ?> data);

}
