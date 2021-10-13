package racinggame.domain;

import racinggame.strategy.MoveStrategy;

public class Car {

    private final CarName name;
    private final CarPosition position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new CarPosition();
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
