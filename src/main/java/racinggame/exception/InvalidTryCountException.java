package racinggame.exception;

public class InvalidTryCountException extends RuntimeException {

    private static final String MESSAGE = "[ERROR] 시도 횟수는 1 이상의 숫자여야 합니다. (현재: %s)";

    public InvalidTryCountException(String count) {
        super(String.format(MESSAGE, count));
    }
}
