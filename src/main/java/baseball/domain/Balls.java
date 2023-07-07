package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Balls {

    private static final int BALLS_SIZE = 3;
    private List<Ball> balls;

    public Balls() {
        this.balls = createBalls();
    }

    private List<Ball> createBalls() {
        List<Ball> ballList = new ArrayList<>();
        boolean isValid = false;

        while (!isValid) {
            ballList = makeBalls();
            isValid = isValidBalls(ballList);
        }

        return ballList;
    }

    private  List<Ball> makeBalls() {
        List<Ball> ballList = new ArrayList<>();
        for(int ballCount = 0; ballCount < BALLS_SIZE; ballCount++) {
            Ball ball = new Ball();
            ballList.add(ball.createBall());
        }
        return ballList;
    }

    private boolean isValidBalls(List<Ball> balls) {
        boolean isValidBallSize = isValidBallSize(balls);
        boolean isValidDuplicatedNumbers = isValidDuplicatedNumbers(balls);

        if(isValidBallSize && isValidDuplicatedNumbers){
            return true;
        }
        return false;
    }

    private boolean isValidBallSize(List<Ball> balls) {
        if (balls.size() != BALLS_SIZE) {
            return false;
        }
        return true;
    }

    private boolean isValidDuplicatedNumbers(List<Ball> balls) {
        Set<String> ballSet = balls.stream()
                .map(Ball::getNumber)
                .collect(Collectors.toSet());
        if (ballSet.size() != BALLS_SIZE) {
            return false;
        }
        return true;
    }

    public String getAnswer() {
        StringBuilder sb = new StringBuilder();
        for(Ball ball: balls) {
            sb.append(ball.getNumber());
        }
        return sb.toString();
    }
}
