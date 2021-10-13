package racinggame.exception;

public class InvalidCarPositionException extends RuntimeException {

    private static final String MESSAGE = "[ERROR] 자동차의 위치 값은 0 이상이어야 합니다. (현재: %d)";

    public InvalidCarPositionException(int position) {
        super(String.format(MESSAGE, position));
    }
}
