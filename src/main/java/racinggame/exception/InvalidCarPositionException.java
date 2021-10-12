package racinggame.exception;

public class InvalidCarPositionException extends RuntimeException {

    private static final String MESSAGE = "[ERROR] 유효하지 않은 위치 값입니다. (현재: %d)";

    public InvalidCarPositionException(int position) {
        super(String.format(MESSAGE, position));
    }
}
