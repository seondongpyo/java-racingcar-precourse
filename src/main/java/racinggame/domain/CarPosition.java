package racinggame.domain;

import racinggame.exception.InvalidCarPositionException;

import java.util.Objects;

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

    public CarPosition max(CarPosition comparingPosition) {
        if (isFurtherThan(comparingPosition)) {
            return this;
        }
        return comparingPosition;
    }

    private boolean isFurtherThan(CarPosition comparingPosition) {
        return value > comparingPosition.value();
    }

    public void increase() {
        value++;
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
