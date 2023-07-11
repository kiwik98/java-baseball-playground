package baseball.domain;

import generator.BallGenerator;

import java.util.List;

public class Baseballs {

    private List<Baseball> balls;

    public void generateBalls(final BallGenerator ballGenerator) {
        this.balls = ballGenerator.generate();
    }

    public List<Baseball> getBalls() {
        return balls;
    }
}
