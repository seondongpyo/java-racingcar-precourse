package racinggame;

import racinggame.domain.*;
import racinggame.strategy.RandomMoveStrategy;
import racinggame.view.InputView;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        CarNames names = InputView.carNames();
        AttemptCount attemptCount = InputView.attemptCount();
        List<Car> cars = CarFactory.from(names);

        RacingGame racingGame = new RacingGame(cars, attemptCount);
        while (!racingGame.isFinish()) {
            racingGame.race(new RandomMoveStrategy());
        }
    }

}
