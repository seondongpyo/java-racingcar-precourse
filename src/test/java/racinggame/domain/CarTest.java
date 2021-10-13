package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @DisplayName("자동차가 앞으로 이동하면 위치 값이 1 증가한다.")
    @Test
    void moveForward() {
        Car car = new Car("pobi");
        car.move(true);
        assertThat(car.position()).isEqualTo(new CarPosition(1));
    }

}
