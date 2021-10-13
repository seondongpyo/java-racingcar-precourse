package racinggame.domain;

import racinggame.strategy.MoveStrategy;

public class Car {

    private final CarName name;
    private final CarPosition position;

    public Car(CarName name) {
        this.name = new CarName(name.value());
        this.position = new CarPosition();
    }

    public Car(String name) {
        this(new CarName(name));
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.isMovable()) {
            position.increase();
        }
    }

    public CarPosition position() {
        return position;
    }
}
