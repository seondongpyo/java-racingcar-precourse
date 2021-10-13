package racinggame.domain;

import racinggame.exception.InvalidCarPositionException;

public class CarPosition {

    private static final int DEFAULT_POSITION = 0;

    private int value;

    public CarPosition() {
        this(DEFAULT_POSITION);
    }

    public CarPosition(int value) {
        validateCarPosition(value);
        this.value = value;
    }

    private void validateCarPosition(int value) {
        if (value < DEFAULT_POSITION) {
            throw new InvalidCarPositionException(value);
        }
    }

    public int value() {
        return value;
    }

}
