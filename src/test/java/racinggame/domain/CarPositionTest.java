package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.exception.InvalidCarPositionException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarPositionTest {

    @DisplayName("자동차의 위치는 최소 0 이상이어야 한다.")
    @ValueSource(ints = {-1, -10})
    @ParameterizedTest
    void invalid(int position) {
        assertThatThrownBy(() -> new CarPosition(position))
            .isInstanceOf(InvalidCarPositionException.class);
    }

}