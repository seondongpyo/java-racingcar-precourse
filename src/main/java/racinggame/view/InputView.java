package racinggame.view;

import nextstep.utils.Console;
import racinggame.domain.CarNames;

public class InputView {

    private static final String MESSAGE_INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";

    private InputView() {
    }

    public static CarNames carNames() {
        System.out.println(MESSAGE_INPUT_CAR_NAMES);
        String names = Console.readLine();
        return CarNames.from(names);
    }

}
