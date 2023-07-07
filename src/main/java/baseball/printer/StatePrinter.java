package baseball.printer;

import baseball.domain.Score;

public interface StatePrinter {

    void displayGameStatus(final Score score);
}
