package baseball.viewer;

public interface MessageViewer {

    void read();

    void solved(final int strikeCount);

    void end(final String restart, final String exit);

    void exit();
}
