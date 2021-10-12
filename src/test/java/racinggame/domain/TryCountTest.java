package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.exception.InvalidTryCountException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TryCountTest {

    @DisplayName("유효하지 않은 시도 횟수 입력 시 예외 발생")
    @ValueSource(strings = {"0", "-1", "*", "3회"})
    @ParameterizedTest
    void invalid(String count) {
        assertThatThrownBy(() -> new TryCount(count))
            .isInstanceOf(InvalidTryCountException.class);
    }

}