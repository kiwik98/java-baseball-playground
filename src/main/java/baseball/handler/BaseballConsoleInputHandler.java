package baseball.handler;

import baseball.request.BallRequest;
import handler.ConsoleInputHandler;

import java.io.IOException;

public class BaseballConsoleInputHandler extends ConsoleInputHandler {

    @Override
    public BallRequest solve() {
        String numbers;
        try {
            numbers = bufferedReader.readLine();
            return new BallRequest(numbers);
        } catch (final IOException e) {
            throw new RuntimeException("잘못된 입력입니다.");
        }
    }
}
