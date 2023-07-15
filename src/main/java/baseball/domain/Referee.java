package baseball.domain;

import baseball.domain.enums.BaseballStatus;

public class Referee {

    private static final int BALLS_SIZE = 3;


    public BaseballCount judge(final Baseballs computerBall, final Baseballs inputBall) {

        String comNumber = computerBall.getBallNumbers();
        String inputNumber = inputBall.getBallNumbers();

        return countBallStatus(comNumber, inputNumber);
    }

    private BaseballCount countBallStatus(final String comNumbers, final String inputNumbers) {
        int strikeCount = 0;
        int ballCount = 0;
        for(int i = 0; i < BALLS_SIZE; i++) {
            strikeCount += strike(comNumbers, inputNumbers, i);
            ballCount   += ball(comNumbers, inputNumbers, i);
        }
        return new BaseballCount(strikeCount, ballCount);
    }

    private int strike(final String comNumber, final String inputNumber, int i) {
        if(GameResult.isStrike(comNumber, inputNumber, i) == BaseballStatus.STRIKE) {
            return 1;
        }
        return 0;
    }


    private int ball(final String comNumber, final String inputNumber, int i) {

        if(GameResult.isBall(comNumber, inputNumber, i) == BaseballStatus.BALL) {
            return 1;
        }
        return 0;
    }
}

