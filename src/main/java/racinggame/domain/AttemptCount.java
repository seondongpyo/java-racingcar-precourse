package racinggame.domain;

import racinggame.exception.InvalidAttemptCountException;

public class AttemptCount {

    private static final String REGEX_FOR_VALID_ATTEMPT_COUNT = "^[0-9]+$";
    private static final int ZERO = 0;

    private int value;

    public AttemptCount(String value) {
        validateAttemptCount(value);
        this.value = Integer.parseInt(value);
    }

    public AttemptCount(int value) {
        this(String.valueOf(value));
    }

    private void validateAttemptCount(String value) {
        if (isInvalid(value)) {
            throw new InvalidAttemptCountException(value);
        }
    }

    private boolean isInvalid(String value) {
        return !value.matches(REGEX_FOR_VALID_ATTEMPT_COUNT) || Integer.parseInt(value) == ZERO;
    }

    public boolean isZero() {
        return value == ZERO;
    }

    public void decrease() {
        value--;
    }

    public int value() {
        return value;
    }

}
