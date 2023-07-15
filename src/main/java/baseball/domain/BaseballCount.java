package baseball.domain;

public class BaseballCount {

    private final int strike;
    private final int ball;

    public BaseballCount(final int strikeCount, final int ballCount) {
        this.strike = strikeCount;
        this.ball = ballCount;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
