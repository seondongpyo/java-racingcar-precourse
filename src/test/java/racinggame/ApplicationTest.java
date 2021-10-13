package racinggame;

import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ApplicationTest extends NSTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    private static final String ERROR_MESSAGE = "[ERROR]";

    @BeforeEach
    void beforeEach() {
        setUp();
    }
    
    @DisplayName("공동 우승")
    @Test
    void winners() {
        assertRandomTest(() -> {
            run("pobi,crong,honux", "1");
            verify("pobi : -", "crong : -", "honux : ", "최종 우승자는 pobi,crong 입니다.");
        }, MOVING_FORWARD, MOVING_FORWARD, STOP);
    }

    @DisplayName("시도 횟수에 대한 예외 처리")
    @ValueSource(strings = {"*", "1회", "0", "-1"})
    @ParameterizedTest
    void invalidAttemptCount(String attemptCount) {
        assertSimpleTest(() -> {
            runNoLineFound("pobi,woni", attemptCount);
            verify(ERROR_MESSAGE);
        });
    }

    @Test
    void 전진_정지() {
        assertRandomTest(() -> {
            run("pobi,woni", "1");
            verify("pobi : -", "woni : ", "최종 우승자는 pobi 입니다.");
        }, MOVING_FORWARD, STOP);
    }

    @Test
    void 이름에_대한_예외_처리() {
        assertSimpleTest(() -> {
            runNoLineFound("pobi,javaji");
            verify(ERROR_MESSAGE);
        });
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
