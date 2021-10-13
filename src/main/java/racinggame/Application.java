package racinggame;

import racinggame.domain.*;
import racinggame.strategy.RandomMoveStrategy;
import racinggame.view.InputView;
import racinggame.view.ResultView;

public class Application {

    public static void main(String[] args) {
        CarNames names = InputView.carNames();
        AttemptCount attemptCount = InputView.attemptCount();
        Cars cars = CarFactory.from(names);

        RacingGame racingGame = new RacingGame(cars, attemptCount);
        ResultView.printResultMessage();
        while (!racingGame.isFinish()) {
            racingGame.race(new RandomMoveStrategy());
            ResultView.showPosition(racingGame.cars());
        }
        ResultView.showWinners(racingGame.winners());
    }
}
