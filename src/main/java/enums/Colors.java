package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Colors {

    BLACK("\u001B[30m"), BLACK_BACKGROUND("\u001B[40m"),
    RED("\u001B[31m"), RED_BACKGROUND("\u001B[41m"),
    GREEN("\u001B[32m"), GREEN_BACKGROUND("\u001B[42m"),
    YELLOW("\u001B[33m"), YELLOW_BACKGROUND("\u001B[43m"),
    BLUE("\u001B[34m"), BLUE_BACKGROUND("\u001B[44m"),
    PURPLE("\u001B[35m"), PURPLE_BACKGROUND("\u001B[45m"),
    CYAN("\u001B[36m"), CYAN_BACKGROUND("\u001B[46m"),
    WHITE("\u001B[37m"), WHITE_BACKGROUND("\u001B[47m");

    private final String value;

    }
