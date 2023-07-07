package baseball.controller;

import baseball.domain.Opponent;
import baseball.domain.Score;
import baseball.dto.BallRequest;
import baseball.handler.InputHandler;
import baseball.printer.StatePrinter;
import baseball.viewer.MessageViewer;

public class ConsoleController {
    private final MessageViewer messageViewer;
    private final InputHandler inputHandler;
    private final StatePrinter statePrinter;
    private final String RESTART = "1";
    private final String EXIT = "2";

    public ConsoleController(final MessageViewer messageViewer,
                             final InputHandler inputHandler,
                             final StatePrinter statePrinter) {
        this.messageViewer = messageViewer;
        this.inputHandler = inputHandler;
        this.statePrinter = statePrinter;
    }

    public void play() {
        progressGame();

    }

    private void progressGame() {
        Opponent opponent = new Opponent();
        Score score;
        boolean isSolved = false;

        do{
            messageViewer.read();
            final String ballRequest = getBallRequest();
            score = opponent.giveScore(ballRequest);
            isSolved = score.isSolved();
            messageViewer.score(score);
        }while(!isSolved);

        if(isSolved) {
            messageViewer.solved(score.getStrikeScore());
            messageViewer.end(RESTART, EXIT);
            processCommand();
        }
    }

    private void processCommand() {
        String inputCommand = inputHandler.command();
        if(RESTART.equals(inputCommand)) {
            progressGame();
        }

        if(EXIT.equals(inputCommand)) {
            messageViewer.exit();
        }
    }


    private String getBallRequest() {
        BallRequest ballRequest = null;
        boolean isValidInput = false;

        while (!isValidInput) {
            ballRequest = inputHandler.solve();
            isValidInput = ballRequest.isValidInput();
        }

        return ballRequest.getNumbers();
    }

}
