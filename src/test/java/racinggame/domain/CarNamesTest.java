package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarNamesTest {

    @DisplayName("입력 받은 문자열을 쉼표(,)로 구분하여 자동차 이름들을 생성한다.")
    @Test
    void create() {
        CarNames carNames = CarNames.from("pobi,woni,crong");
        List<CarName> expectedNames = Arrays.asList(
            new CarName("pobi"),
            new CarName("woni"),
            new CarName("crong")
        );
        assertThat(carNames.names()).isEqualTo(expectedNames);
    }

}