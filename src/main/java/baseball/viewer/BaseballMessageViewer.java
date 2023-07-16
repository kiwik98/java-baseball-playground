package baseball.viewer;

import viewer.ConsoleMessageViewer;

public class BaseballMessageViewer extends ConsoleMessageViewer {

    public static final int BASEBALL_SIZE = 3;
    public static final int RESTART = 1;
    public static final int END = 2;

    @Override
    protected String startMessage() {
        return "숫자 야구 게임을 시작합니다.";
    }

    @Override
    protected String readMessage() {
        return "숫자를 입력해주세요 : ";
    }

    @Override
    protected String endMessage() {
        return String.format("%d개의 숫자를 모두 맞히셨습니다! 게임 종료", BASEBALL_SIZE);
    }

    @Override
    protected String restartMessage() {
        return String.format("게임을 새로 시작하려면 %d, 종료하려면 %d를 입력하세요.", RESTART, END);
    }


}
