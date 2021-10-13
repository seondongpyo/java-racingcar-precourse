package racinggame.domain;

import racinggame.strategy.MoveStrategy;

import java.util.List;

public class RacingGame {

    private final Cars cars;
    private final AttemptCount attemptCount;

    public RacingGame(Cars cars, AttemptCount attemptCount) {
        this.cars = cars;
        this.attemptCount = new AttemptCount(attemptCount.value());
    }

    public void race(MoveStrategy moveStrategy) {
        if (isFinish()) {
            return;
        }

        attemptCount.decrease();
        cars.move(moveStrategy);
    }

    public boolean isFinish() {
        return attemptCount.isZero();
    }

    public List<Car> cars() {
        return cars.cars();
    }

}
