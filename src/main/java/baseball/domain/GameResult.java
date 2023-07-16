package baseball.domain;

import baseball.domain.enums.BaseballStatus;

public class GameResult {

    public static BaseballStatus isStrike(String comNumber, String inputNumber, int i) {
        return comNumber.charAt(i) == inputNumber.charAt(i) ? BaseballStatus.STRIKE : BaseballStatus.NOTHING;
    }

    public static BaseballStatus isBall(String comNumber, String inputNumber, int i) {
        if(comNumber.charAt(i) != inputNumber.charAt(i)
           && comNumber.contains(String.valueOf(inputNumber.charAt(i)))) {
            return BaseballStatus.BALL;
        }
        return BaseballStatus.NOTHING;
    }

    public static boolean isNothing(BaseballCount ballCount) {
        return ballCount.getBall() == 0 && ballCount.getStrike() == 0;
    }

    public static boolean isOnlyStrike(BaseballCount ballCount) {
        return ballCount.getStrike() > 0 && ballCount.getBall() == 0;
    }

    public static boolean isOnlyBall(BaseballCount ballCount) {
        return ballCount.getBall() > 0 && ballCount.getStrike() == 0;
    }

    public static boolean isFairResult(BaseballCount ballCount) {
        return ballCount.getStrike() > 0 && ballCount.getBall() > 0;
    }
}
