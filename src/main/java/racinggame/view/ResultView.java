package racinggame.view;

import racinggame.domain.Car;
import racinggame.domain.RaceWinners;

import java.util.List;

public class ResultView {

    private static final String MESSAGE_RACE_RESULT = "%n실행 결과%n";
    private static final String SYMBOL = "-";
    private static final String DELIMITER = ",";

    private ResultView() {
    }

    public static void printResultMessage() {
        System.out.printf(MESSAGE_RACE_RESULT);
    }

    public static void showPosition(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(String.format("%s : %s", car.name(), convertPositionValueToSymbol(car.position().value())));
        }
        System.out.println();
    }

    private static String convertPositionValueToSymbol(int position) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < position; index++) {
            builder.append(SYMBOL);
        }
        return builder.toString();
    }

    public static void showWinners(RaceWinners winners) {
        System.out.printf("최종 우승자는 %s 입니다.", String.join(DELIMITER, winners.names()));
    }

}
