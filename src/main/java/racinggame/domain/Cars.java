package racinggame.domain;

import racinggame.strategy.MoveStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = new ArrayList<>(cars);
    }

    public void move(MoveStrategy moveStrategy) {
        for (Car car : cars) {
            car.move(moveStrategy);
        }
    }

    public RaceWinners winners() {
        CarPosition maxPosition = findMaxPosition();
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            addCarToWinnersIfCarIsWinner(car, maxPosition, winners);
        }
        return new RaceWinners(winners);
    }

    private CarPosition findMaxPosition() {
        CarPosition position = new CarPosition();
        for (Car car : cars) {
            position = car.findMaxPositionComparingTo(position);
        }
        return position;
    }

    private void addCarToWinnersIfCarIsWinner(Car car, CarPosition maxPosition, List<Car> winners) {
        if (car.isLocatedAt(maxPosition)) {
            winners.add(car);
        }
    }

    public List<Car> cars() {
        return Collections.unmodifiableList(cars);
    }

}
