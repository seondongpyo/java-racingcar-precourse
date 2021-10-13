package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class RaceWinners {

    private final List<Car> winners;

    public RaceWinners(List<Car> winners) {
        this.winners = new ArrayList<>(winners);
    }

    public List<String> names() {
        List<String> winnerNames = new ArrayList<>();
        for (Car winner : winners) {
            winnerNames.add(winner.name());
        }
        return winnerNames;
    }
}
