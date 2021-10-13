package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    private CarFactory() {
    }

    public static List<Car> from(CarNames carNames) {
        List<Car> cars = new ArrayList<>();
        for (CarName name : carNames.names()) {
            cars.add(new Car(name));
        }
        return cars;
    }

}
