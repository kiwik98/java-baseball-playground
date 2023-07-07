package baseball.viewer;

import baseball.domain.Score;

import java.util.Timer;
import java.util.TimerTask;

public class ConsoleMessageViewer implements MessageViewer {
    @Override
    public void read() {
        final String readMessage = "숫자를 입력해 주세요 : ";
        System.out.print(readMessage);
    }

    @Override
    public void score(final Score score) {
        final int ballScore = score.getBallScore();
        final int strikeScore = score.getStrikeScore();
        final String scoreMessage = getScoreMessage(ballScore, strikeScore);
        printMessage(scoreMessage);
    }

    @Override
    public void solved(final int strikeCount) {
        final String solvedMessage = String.format("%d개의 숫자를 모두 맞히셨습니다! 게임 종료", strikeCount);
        printMessage(solvedMessage);
    }

    @Override
    public void end(final String restart, final String exit) {
        final String restartMessage = String.format("게임을 새로 시작하려면 %s, 종료하려면 %s를 입력하세요.", restart, exit);
        printMessage(restartMessage);
    }

    @Override
    public void exit() {
        final String exitMessage = "숫자 야구 게임을 종료합니다.";
        printMessage(exitMessage);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.exit(0);
            }
        };
        timer.schedule(task, 2000);
    }

    private void printMessage(final String message) {
        System.out.println(message);
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
