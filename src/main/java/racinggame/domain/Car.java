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

    public Car(String name, int position) {
        this.name = new CarName(name);
        this.position = new CarPosition(position);
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.isMovable()) {
            position.increase();
        }
    }

    public CarPosition findMaxPositionComparingTo(CarPosition comparingPosition) {
        return this.position.max(comparingPosition);
    }

    public boolean isLocatedAt(CarPosition position) {
        return this.position.equals(position);
    }

    public CarPosition position() {
        return position;
    }

    public String name() {
        return name.value();
    }
}
