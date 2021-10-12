package racinggame.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class WinnersTest {

    @Test
    void create() {
        Winners winners = new Winners(Arrays.asList(
            new Car(new CarName("pobi")),
            new Car(new CarName("woni"))
        ));

        assertThat(winners.names()).containsExactly("pobi", "woni");
    }

}