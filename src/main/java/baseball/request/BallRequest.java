package baseball.request;

public class BallRequest {

    private final String numbers;

    public BallRequest(final String numbers) {
        this.numbers = numbers;
    }

    public String getRequest() {
        if(isValidInput()) {
            return numbers;
        }else {
            throw new IllegalArgumentException("유효하지 않은 입력 값입니다.");
        }
    }

    private boolean isValidInput() {
        if(isValidLength() && isValidNumber()) {
            return true;
        }
        return false;
    }

    private boolean isValidLength() {
        return numbers.length() == 3;
    }

    private boolean isValidNumber() {
        try {
            Integer.parseInt(numbers);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }
}
