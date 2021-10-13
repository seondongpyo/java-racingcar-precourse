package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.exception.InvalidCarPositionException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarPositionTest {

    @DisplayName("자동차 위치 생성 시 기본 위치 값을 0으로 생성한다.")
    @Test
    void create() {
        CarPosition carPosition = new CarPosition();
        assertThat(carPosition.value()).isZero();
    }

    @DisplayName("0보다 작은 위치 값으로 자동차의 위치 생성 시 예외가 발생한다.")
    @Test
    void invalid() {
        assertThatThrownBy(() -> new CarPosition(-1))
            .isInstanceOf(InvalidCarPositionException.class);
    }

}
