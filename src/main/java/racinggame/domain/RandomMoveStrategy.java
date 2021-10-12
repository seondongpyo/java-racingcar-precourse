package racinggame.domain;

import nextstep.utils.Randoms;

public class RandomMoveStrategy implements MoveStrategy {

    @Override
    public boolean isMovable() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }
}
