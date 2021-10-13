package racinggame.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarNames {

    private static final String DELIMITER = ",";

    private final List<CarName> names;

    private CarNames(List<CarName> names) {
        this.names = new ArrayList<>(names);
    }

    public static CarNames from(String carNames) {
        List<CarName> names = new ArrayList<>();
        String[] nameArray = carNames.split(DELIMITER);
        for (String name : nameArray) {
            names.add(new CarName(name));
        }
        return new CarNames(names);
    }

    public List<CarName> names() {
        return Collections.unmodifiableList(names);
    }

}
