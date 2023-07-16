import baseball.handler.BaseballConsoleInputHandler;
import baseball.request.BallRequest;

public class BaseballApplication {
    public static void main(String[] args) {

        BaseballConsoleInputHandler input = new BaseballConsoleInputHandler();

        BallRequest request = input.solve();

        System.out.println("request: " + request.getRequest());
    }
}
