package racinggame.view;

import racinggame.domain.Car;
import racinggame.domain.Winners;

import java.util.List;

public class ResultView {

    private ResultView() {
    }

    public static void show(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.name() + " : " + positionAsSymbol(car.position().value()));
        }
        System.out.println();
    }

    private static String positionAsSymbol(int position) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }

    public static void result(Winners winners) {
        System.out.printf("최종 우승자는 %s 입니다.", String.join(",", winners.names()));
    }
}
