package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    private CarFactory() {
    }

    public static Cars from(CarNames carNames) {
        List<Car> cars = new ArrayList<>();
        for (CarName carName : carNames.names()) {
            cars.add(new Car(carName));
        }
        return new Cars(cars);
    }

}
