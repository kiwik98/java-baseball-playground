package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameResultTest {
    @Test
    void isNothing() {
        boolean result = GameResult.isNothing(new BaseballCount(0, 0));
        assertThat(result).isTrue();
    }

    @Test
    void isOnlyStrike() {
        boolean result = GameResult.isOnlyStrike(new BaseballCount(1, 0));
        assertThat(result).isTrue();
    }

    @Test
    void isOnlyBall() {
        boolean result = GameResult.isOnlyBall(new BaseballCount(0, 1));
        assertThat(result).isTrue();
    }

    @Test
    void isFairResult() {
        boolean result = GameResult.isFairResult(new BaseballCount(1, 1));
        assertThat(result).isTrue();
    }

    @Test
    void isThreeStrike() {
        boolean result = GameResult.isThreeStrike(new BaseballCount(3, 0));
        assertThat(result).isTrue();
    }
}