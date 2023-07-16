package baseball.printer;

import baseball.domain.BaseballCount;
import baseball.domain.GameResult;
import printer.ConsoleStatePrinter;

public class BaseballStatePrinter implements ConsoleStatePrinter<BaseballCount> {
    @Override
    public void displayGameStatus(final BaseballCount ballCount) {
        if(GameResult.isNothing(ballCount)) {
            System.out.println("낫싱");
        }

        if(GameResult.isOnlyStrike(ballCount)) {
            System.out.println(String.format("%d볼", ballCount.getBall()));
        }

        if(GameResult.isOnlyBall(ballCount)) {
            System.out.println(String.format("%d스트라이크", ballCount.getStrike()));
        }

        if(GameResult.isFairResult(ballCount)) {
            System.out.println(String.format("%d스트라이크 %d볼", ballCount.getStrike(), ballCount.getBall()));
        }

    }
}
