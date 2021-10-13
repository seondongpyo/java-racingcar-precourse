package racinggame.domain;

import racinggame.exception.InvalidCarNameLengthException;

public class CarName {

    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 5;

    private final String value;

    public CarName(String value) {
        validateCarNameLength(value);
        this.value = value;
    }

    private void validateCarNameLength(String value) {
        int nameLength = value.length();
        if (nameLength < MIN_LENGTH || nameLength > MAX_LENGTH) {
            throw new InvalidCarNameLengthException(value);
        }
    }

}
