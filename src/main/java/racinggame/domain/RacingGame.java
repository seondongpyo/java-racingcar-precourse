package racinggame.domain;

import racinggame.strategy.MoveStrategy;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private final List<Car> cars;
    private final AttemptCount attemptCount;

    public RacingGame(List<Car> cars, AttemptCount attemptCount) {
        this.cars = new ArrayList<>(cars);
        this.attemptCount = new AttemptCount(attemptCount.value());
    }

    public void race(MoveStrategy moveStrategy) {
        if (isFinish()) {
            return;
        }

        attemptCount.decrease();
        for (Car car : cars) {
            car.move(moveStrategy);
        }
    }

    public boolean isFinish() {
        return attemptCount.isZero();
    }

    public AttemptCount attemptCount() {
        return attemptCount;
    }

}
