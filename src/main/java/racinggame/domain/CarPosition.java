package racinggame.domain;

import racinggame.exception.InvalidCarPositionException;

import java.util.Objects;

public class CarPosition {

    private static final int INITIAL_POSITION = 0;

    private int value;

    public CarPosition() {
        this(INITIAL_POSITION);
    }

    public CarPosition(int value) {
        validatePosition(value);
        this.value = value;
    }

    private void validatePosition(int value) {
        if (value < INITIAL_POSITION) {
            throw new InvalidCarPositionException(value);
        }
    }

    public void increase() {
        value++;
    }

    public boolean isFurtherThan(CarPosition comparingPosition) {
        return this.value > comparingPosition.value;
    }

    public int value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarPosition position = (CarPosition) o;
        return value == position.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
