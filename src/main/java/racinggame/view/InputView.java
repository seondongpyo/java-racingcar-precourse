package racinggame.view;

import nextstep.utils.Console;
import racinggame.domain.CarNames;
import racinggame.domain.TryCount;

public class InputView {

    private InputView() {
    }

    public static CarNames carNames() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String names = Console.readLine();
        try {
            return CarNames.from(names);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return carNames();
        }
    }

    public static TryCount tryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String tryCount = Console.readLine();
        try {
            return new TryCount(tryCount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return tryCount();
        }
    }
}
