package baseball.config;

import baseball.controller.ConsoleController;
import baseball.handler.ConsoleInputHandler;
import baseball.handler.InputHandler;
import baseball.printer.ConsoleStatePrinter;
import baseball.printer.StatePrinter;
import baseball.viewer.ConsoleMessageViewer;
import baseball.viewer.MessageViewer;

public class DIContainer {


    private static final MessageViewer MESSAGE_VIEWER;
    private static final InputHandler INPUT_HANDLER;
    private static final StatePrinter STATE_PRINTER;
    private static final ConsoleController CONTROLLER;
    static {
        MESSAGE_VIEWER = new ConsoleMessageViewer();
        INPUT_HANDLER = new ConsoleInputHandler();
        STATE_PRINTER = new ConsoleStatePrinter();
        CONTROLLER = new ConsoleController(MESSAGE_VIEWER, INPUT_HANDLER, STATE_PRINTER);
    }

public static ConsoleController getController() {
    return CONTROLLER;
}
}
