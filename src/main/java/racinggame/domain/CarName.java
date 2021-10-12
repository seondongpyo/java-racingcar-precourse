package racinggame.domain;

import racinggame.exception.InvalidCarNameLengthException;

import java.util.Objects;

public class CarName {

    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 5;

    private final String value;

    public CarName(String value) {
        validateNameLength(value);
        this.value = value;
    }

    private void validateNameLength(String value) {
        int nameLength = value.length();
        if (nameLength < MIN_LENGTH || nameLength > MAX_LENGTH) {
            throw new InvalidCarNameLengthException(value);
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(value, carName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
