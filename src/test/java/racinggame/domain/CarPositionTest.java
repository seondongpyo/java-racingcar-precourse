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

    @DisplayName("자동차 위치 값이 증가한다.")
    @Test
    void increase() {
        CarPosition position = new CarPosition(3);
        position.increase();
        assertThat(position.value()).isEqualTo(4);
    }

    @DisplayName("두 위치 값을 비교하여 가장 먼 위치를 구한다.")
    @Test
    void max() {
        CarPosition position = new CarPosition(3);
        assertThat(position.max(new CarPosition(5))).isEqualTo(new CarPosition(5));
    }

}
