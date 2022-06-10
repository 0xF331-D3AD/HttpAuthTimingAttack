package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BodyPublisherType {

    JSON("JSON"),
    FORM_DATA("FORM-DATA");

    private final String cmdValue;

}
