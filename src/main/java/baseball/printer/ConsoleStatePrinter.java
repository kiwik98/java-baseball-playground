package baseball.printer;

import baseball.domain.Score;

public class ConsoleStatePrinter implements StatePrinter {
    @Override
    public void displayGameStatus(final Score score) {
        final int ballScore = score.getBallScore();
        final int strikeScore = score.getStrikeScore();
        final String scoreMessage = getScoreMessage(ballScore, strikeScore);
        System.out.println(scoreMessage);
    }

    private String getScoreMessage(final int ballScore, final int strikeScore) {
        String scoreMessage = "";

        if(ballScore < 1 && strikeScore < 1) {
            return"낫싱";
        }

        if(ballScore > 0) {
            scoreMessage += String.format("%d볼 ", ballScore);
        }

        if (strikeScore > 0) {
            scoreMessage += String.format("%d스트라이크", strikeScore);
        }

        return scoreMessage;
    }
}
