package baseball;

import baseball.config.DIContainer;
import baseball.controller.ConsoleController;

public class BaseballApplication {
    public static void main(String[] args) {
        ConsoleController controller = DIContainer.getController();
        controller.play();
    }
}
