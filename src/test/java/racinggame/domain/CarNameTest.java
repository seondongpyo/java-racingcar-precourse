package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatNoException;

class CarNameTest {

    @DisplayName("문자열로 자동차 이름을 생성한다.")
    @ValueSource(strings = {"A", "pobi"})
    @ParameterizedTest
    void create(String name) {
        assertThatNoException().isThrownBy(() -> new CarName(name));
    }

}
