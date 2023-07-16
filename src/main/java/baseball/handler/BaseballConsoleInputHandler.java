package baseball.handler;

import baseball.request.BallRequest;
import handler.ConsoleInputHandler;

import java.io.IOException;

public class BaseballConsoleInputHandler extends ConsoleInputHandler {

    @Override
    public String solve() {
        String numbers;
        try {
            numbers = bufferedReader.readLine();
            BallRequest request = new BallRequest(numbers);
            return request.getRequest();
        } catch (final IOException e) {
            throw new RuntimeException("잘못된 입력입니다.");
        }
    }
}
