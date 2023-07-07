package baseball.handler;

import baseball.dto.BallRequest;

public interface InputHandler {
    String command();

    BallRequest solve();
}
