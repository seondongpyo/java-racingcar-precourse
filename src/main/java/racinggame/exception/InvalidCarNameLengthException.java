package racinggame.exception;

public class InvalidCarNameLengthException extends RuntimeException {

    private static final String MESSAGE = "[ERROR] 자동차 이름은 1자 이상 5자 이하여야 합니다. (현재: %s (%d자)))";

    public InvalidCarNameLengthException(String carName) {
        super(String.format(MESSAGE, carName, carName.length()));
    }
}
