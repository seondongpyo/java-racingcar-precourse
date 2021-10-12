package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.exception.InvalidCarNameLengthException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {

    @DisplayName("자동차 이름의 길이는 1 이상 5 이하여야 한다.")
    @ValueSource(strings = {"", "javajigi"})
    @ParameterizedTest
    void invalid(String carName) {
        assertThatThrownBy(() -> new CarName(carName))
            .isInstanceOf(InvalidCarNameLengthException.class);
    }

}