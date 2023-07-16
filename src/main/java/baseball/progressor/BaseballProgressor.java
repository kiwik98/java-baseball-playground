package baseball.progressor;

import baseball.domain.BaseballCount;
import baseball.domain.Baseballs;
import baseball.domain.GameResult;
import baseball.domain.Referee;
import baseball.generator.InputBaseballGenerator;
import baseball.handler.BaseballConsoleInputHandler;
import baseball.printer.BaseballStatePrinter;
import baseball.viewer.BaseballMessageViewer;

public class BaseballProgressor {
    private static final String RESTART = "1";
    private static final String EXIT = "2";

    private static final BaseballMessageViewer MESSAGE_VIEWER;
    private static final BaseballConsoleInputHandler INPUT_HANDLER;
    private static final BaseballStatePrinter STATE_PRINTER;

    static {
        MESSAGE_VIEWER = new BaseballMessageViewer();
        INPUT_HANDLER = new BaseballConsoleInputHandler();
        STATE_PRINTER = new BaseballStatePrinter();
    }
    public void run() {
        MESSAGE_VIEWER.start();
        progressGame();
    }

    private void progressGame() {
        Baseballs computer = new Baseballs();
        Baseballs user = new Baseballs();
        Referee referee = new Referee();
        BaseballCount count;
        computer.generateBalls(new InputBaseballGenerator("123"));
        do {
            MESSAGE_VIEWER.read();
            String request = INPUT_HANDLER.solve();
            user.generateBalls(new InputBaseballGenerator(request));
            count = referee.judge(computer, user);
            STATE_PRINTER.displayGameStatus(count);
        }while (!GameResult.isThreeStrike(count));
        MESSAGE_VIEWER.end();
        MESSAGE_VIEWER.restart();
        commandProccessor(INPUT_HANDLER.command());
    }

    private void commandProccessor(String command) {
        switch (command) {
            case RESTART:
                progressGame();
                break;
            case EXIT:
                return;
            default:
                throw new IllegalStateException("잘못된 명령어 입니다.");
        }
    }
}
