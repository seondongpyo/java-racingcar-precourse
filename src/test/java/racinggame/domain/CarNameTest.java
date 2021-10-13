package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.exception.InvalidCarNameLengthException;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {

    @DisplayName("문자열로 자동차 이름을 생성한다.")
    @ValueSource(strings = {"A", "pobi"})
    @ParameterizedTest
    void create(String name) {
        assertThatNoException().isThrownBy(() -> new CarName(name));
    }

    @DisplayName("자동차 이름이 1자 미만, 5자 초과일 경우 예외가 발생한다.")
    @ValueSource(strings = {"", "javajigi"})
    @ParameterizedTest
    void invalid(String name) {
        assertThatThrownBy(() -> new CarName(name))
            .isInstanceOf(InvalidCarNameLengthException.class);
    }

}
