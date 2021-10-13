package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatNoException;

class AttemptCountTest {

    @DisplayName("문자열로 시도 횟수를 생성한다.")
    @ValueSource(strings = {"1", "10"})
    @ParameterizedTest
    void create(String value) {
        assertThatNoException().isThrownBy(() -> new AttemptCount(value));
    }

}
