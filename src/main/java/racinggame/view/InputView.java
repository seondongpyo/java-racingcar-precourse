package racinggame.view;

import nextstep.utils.Console;
import racinggame.domain.AttemptCount;
import racinggame.domain.CarNames;

public class InputView {

    private static final String MESSAGE_INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";
    private static final String MESSAGE_INPUT_ATTEMPT_COUNT = "시도할 회수는 몇회인가요?";

    private InputView() {
    }

    public static CarNames carNames() {
        System.out.println(MESSAGE_INPUT_CAR_NAMES);
        String names = Console.readLine();
        try {
            return CarNames.from(names);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return carNames();
        }
    }

    public static AttemptCount attemptCount() {
        System.out.println(MESSAGE_INPUT_ATTEMPT_COUNT);
        String attemptCount = Console.readLine();
        try {
            return new AttemptCount(attemptCount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return attemptCount();
        }
    }
}
