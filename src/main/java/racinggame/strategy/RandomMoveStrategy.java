package racinggame.strategy;

import nextstep.utils.Randoms;

public class RandomMoveStrategy implements MoveStrategy {

    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private static final int MOVABLE_NUMBER = 4;

    @Override
    public boolean isMovable() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER) >= MOVABLE_NUMBER;
    }

}
