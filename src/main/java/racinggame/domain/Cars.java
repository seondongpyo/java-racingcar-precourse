package racinggame.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void race(MoveStrategy moveStrategy) {
        for (Car car : cars) {
            car.move(moveStrategy);
        }
    }

    public List<Car> cars() {
        return Collections.unmodifiableList(cars);
    }

    public Winners findWinners() {
        CarPosition maxPosition = findMaxPosition();
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.isLocatedAt(maxPosition)) {
                winners.add(car);
            }
        }
        return new Winners(winners);
    }

    private CarPosition findMaxPosition() {
        CarPosition maxPosition = new CarPosition();
        for (Car car : cars) {
            CarPosition currentCarPosition = car.position();
            maxPosition = maxPositionBetween(maxPosition, currentCarPosition);
        }
        return maxPosition;
    }

    private CarPosition maxPositionBetween(CarPosition position, CarPosition comparingPosition) {
        if (position.isFurtherThan(comparingPosition)) {
            return position;
        }
        return comparingPosition;
    }
}
