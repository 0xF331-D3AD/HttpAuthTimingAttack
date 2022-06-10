package bodypublisher;

import enums.BodyPublisherType;

public class AbstractBodyPublisherFactory {

    private AbstractBodyPublisherFactory() {
    }

    public static BodyPublisherFactory createBodyPublisherFactory(BodyPublisherType type) {
        switch (type) {
            case JSON:
                return new JsonBodyPublisherFactory();
            case FORM_DATA:
                return new FormDataBodyPublisherFactory();
        }
        throw new RuntimeException(String.format("Body publisher %s not supported", type));
    }

}
