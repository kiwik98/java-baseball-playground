package baseball.exception;

public class InvalidInputException extends RuntimeException {
    private static final String MESSAGE = "잘못된 입력입니다.";

    public InvalidInputException() {
        super(MESSAGE);
    }
}
