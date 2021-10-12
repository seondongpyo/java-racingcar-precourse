package racinggame.domain;

public class Car {

    private final CarName name;
    private final CarPosition position;

    public Car(CarName name, CarPosition position) {
        this.name = name;
        this.position = position;
    }

    public Car(CarName name) {
        this(name, new CarPosition(0));
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.isMovable()) {
            position.increase();
        }
    }

    public CarPosition position() {
        return position;
    }

    public String name() {
        return name.value();
    }

    public boolean isLocatedAt(CarPosition comparingPosition) {
        return position.equals(comparingPosition);
    }
}
