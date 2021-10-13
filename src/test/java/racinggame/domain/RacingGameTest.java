package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RacingGameTest {

    @DisplayName("시도 횟수가 0이 되면 자동차 경주는 종료된다.")
    @Test
    void finish() {
        List<Car> cars = Arrays.asList(new Car("pobi"), new Car("woni"));
        AttemptCount attemptCount = new AttemptCount(2);
        RacingGame racingGame = new RacingGame(cars, attemptCount);

        racingGame.race(() -> true);
        assertThat(racingGame.isFinish()).isFalse();

        racingGame.race(() -> true);
        assertThat(racingGame.isFinish()).isTrue();
    }
}
