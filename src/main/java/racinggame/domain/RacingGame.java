package racinggame.domain;

import java.util.List;

public class RacingGame {

    private final Cars cars;
    private final TryCount tryCount;

    public RacingGame(Cars cars, TryCount tryCount) {
        this.cars = cars;
        this.tryCount = tryCount;
    }

    public void race(MoveStrategy moveStrategy) {
        tryCount.decrease();
        cars.race(moveStrategy);
    }

    public boolean isEnd() {
        return tryCount.isZero();
    }

    public Winners winners() {
        return cars.findWinners();
    }

    public List<Car> cars() {
        return cars.cars();
    }
}
