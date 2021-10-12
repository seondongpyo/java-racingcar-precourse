package racinggame.exception;

public class InvalidCarNameLengthException extends RuntimeException {

    private static final String MESSAGE = "[ERROR] 자동차 이름의 길이는 1 이상 5 이하여야 합니다. (현재: %s(%d)))";

    public InvalidCarNameLengthException(String carName) {
        super(String.format(MESSAGE, carName, carName.length()));
    }
}
