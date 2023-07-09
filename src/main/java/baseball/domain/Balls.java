package baseball.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Balls {

    private static final int BALLS_SIZE = 3;
    private List<Ball> balls;

    public Balls() {
        this.balls = createBalls();
    }

    private List<Ball> createBalls() {
        List<Ball> ballList = makeBalls();
        return ballList;
    }

    private List<Ball> makeBalls() {
        List<Ball> ballList = new ArrayList<>();
        Set<String> usedNumbers = new HashSet<>(); // 중복 체크를 위한 Set

        while (ballList.size() < BALLS_SIZE) {
            createNotDuplicateBalls(ballList, usedNumbers);
        }
        return ballList;
    }

    private void createNotDuplicateBalls(List<Ball> ballList, Set<String> usedNumbers) {
        Ball ball = new Ball().createBall();
        String number = ball.getNumber();

        if (!usedNumbers.contains(number)) {
            ballList.add(ball);
            usedNumbers.add(number);
        }
    }

    public String getAnswer() {
        StringBuilder sb = new StringBuilder();
        for(Ball ball: balls) {
            sb.append(ball.getNumber());
        }
        return sb.toString();
    }
}
