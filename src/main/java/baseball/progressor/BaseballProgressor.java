package baseball.progressor;

import baseball.domain.BaseballCount;
import baseball.domain.Baseballs;
import baseball.domain.Referee;
import baseball.generator.InputBaseballGenerator;
import baseball.handler.BaseballConsoleInputHandler;
import baseball.printer.BaseballStatePrinter;
import baseball.viewer.BaseballMessageViewer;

public class BaseballProgressor {

    private static final BaseballMessageViewer MESSAGE_VIEWER;
    private static final BaseballConsoleInputHandler INPUT_HANDLER;
    private static final BaseballStatePrinter STATE_PRINTER;

    static {
        MESSAGE_VIEWER = new BaseballMessageViewer();
        INPUT_HANDLER = new BaseballConsoleInputHandler();
        STATE_PRINTER = new BaseballStatePrinter();
    }
    public void run() {
        Baseballs computer = new Baseballs();
        Baseballs user = new Baseballs();
        computer.generateBalls(new InputBaseballGenerator("123"));
        MESSAGE_VIEWER.start();
        MESSAGE_VIEWER.read();
        String request = INPUT_HANDLER.solve();
        user.generateBalls(new InputBaseballGenerator(request));
        Referee referee = new Referee();
        BaseballCount count = referee.judge(computer, user);
        STATE_PRINTER.displayGameStatus(count);

    }
}
