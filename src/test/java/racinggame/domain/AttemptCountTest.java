package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.exception.InvalidAttemptCountException;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class AttemptCountTest {

    @DisplayName("문자열로 시도 횟수를 생성한다.")
    @ValueSource(strings = {"1", "10"})
    @ParameterizedTest
    void create(String value) {
        assertThatNoException().isThrownBy(() -> new AttemptCount(value));
    }

    @DisplayName("시도 횟수가 문자 또는 0 이하의 숫자일 경우 예외가 발생한다.")
    @ValueSource(strings = {"*", "1회", "0", "-1"})
    @ParameterizedTest
    void invalid(String value) {
        assertThatThrownBy(() -> new AttemptCount(value))
            .isInstanceOf(InvalidAttemptCountException.class);
    }
}
