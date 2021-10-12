package racinggame.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarNamesTest {

    @Test
    void create() {
        CarNames carNames = CarNames.from("pobi,crong,honux");
        List<CarName> names = carNames.names();
        assertThat(names).containsExactly(new CarName("pobi"), new CarName("crong"), new CarName("honux"));
    }

}