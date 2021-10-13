package racinggame.domain;

public class Car {

    private final CarName name;
    private final CarPosition position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new CarPosition();
    }

    public void move(boolean isMovable) {
        if (isMovable) {
            position.increase();
        }
    }

    public CarPosition position() {
        return position;
    }
}
