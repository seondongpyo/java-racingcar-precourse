package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @DisplayName("자동차 경주의 우승자를 구한다.")
    @Test
    void winners() {
        Cars cars = new Cars(Arrays.asList(
            new Car("pobi", 3),
            new Car("crong", 3),
            new Car("honux", 2)
        ));

        RaceWinners winners = cars.winners();
        assertThat(winners.names()).contains("pobi", "crong");
    }
}