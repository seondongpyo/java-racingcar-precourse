package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarPositionTest {

    @DisplayName("자동차 위치 생성 시 기본 위치 값을 0으로 생성한다.")
    @Test
    void create() {
        CarPosition carPosition = new CarPosition();
        assertThat(carPosition.value()).isZero();
    }

}
