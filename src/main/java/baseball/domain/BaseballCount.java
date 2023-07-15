package baseball.domain;

public class BaseballCount {

    private int strike;
    private int ball;

    public BaseballCount(int strikeCount, int ballCount) {
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
