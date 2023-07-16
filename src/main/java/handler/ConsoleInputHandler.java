package handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public abstract class ConsoleInputHandler implements InputHandler{
    protected final BufferedReader bufferedReader;

    public ConsoleInputHandler() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String command() {
        try {
            return bufferedReader.readLine();
        }catch (final IOException e) {
            throw new RuntimeException("잘못된 명령입니다.");
        }
    }

}
