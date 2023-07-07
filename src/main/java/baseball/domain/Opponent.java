package baseball.domain;

public class Opponent {
    private final Balls balls;
    private final Score score;

    public Opponent() {
        this.balls = new Balls();
        this.score = new Score();
    }

    public Score giveScore(final String solve) {
        final String answer = balls.getAnswer();
        score.count(answer, solve);
        return score;
    }

}
