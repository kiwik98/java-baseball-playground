package baseball.viewer;

import baseball.domain.Score;

public interface MessageViewer {

    void read();

    void score(final Score score);

    void solved(final int strikeCount);

    void end(final String restart, final String exit);

    void exit();
}
