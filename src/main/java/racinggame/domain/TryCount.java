package racinggame.domain;

import racinggame.exception.InvalidTryCountException;

public class TryCount {

    private static final String REGEX_FOR_VALID_COUNT = "^[1-9]+$";
    private static final int ZERO = 0;

    private int count;

    public TryCount(String count) {
        validateTryCount(count);
        this.count = Integer.parseInt(count);
    }

    private void validateTryCount(String count) {
        if (isInvalid(count)) {
            throw new InvalidTryCountException(count);
        }
    }

    private boolean isInvalid(String count) {
        return !count.matches(REGEX_FOR_VALID_COUNT);
    }

    public boolean isZero() {
        return count == ZERO;
    }

    public void decrease() {
        count--;
    }
}
