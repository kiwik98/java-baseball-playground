package baseball.handler;

import baseball.dto.BallRequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputHandler implements InputHandler{

    private final BufferedReader bufferedReader;

    public ConsoleInputHandler() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }


    @Override
    public String command() {
        String command;
        try {
            return bufferedReader.readLine();
        }catch (final IOException e) {
            throw new RuntimeException("잘못된 명령입니다.");
        }
    }

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
