package racinggame;

import racinggame.domain.*;
import racinggame.view.InputView;
import racinggame.view.ResultView;

public class Application {

    public static void main(String[] args) {
        CarNames carNames = InputView.carNames();
        TryCount tryCount = InputView.tryCount();
        Cars cars = CarFactory.from(carNames);
        RacingGame racingGame = new RacingGame(cars, tryCount);

        System.out.println("실행 결과");
        while (!racingGame.isEnd()) {
            racingGame.race(new RandomMoveStrategy());
            ResultView.show(racingGame.cars());
        }
        ResultView.result(racingGame.winners());
    }

}
