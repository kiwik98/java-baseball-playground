package baseball.dto;

import baseball.exception.InvalidInputException;

public class BallRequest {

    private final int NUMBERS_SIZE = 3;
    private final String numbers;

    public String getNumbers() {
        return numbers;
    }

    public BallRequest(final String numbers) {
        this.numbers = numbers;
    }

    public boolean isValidInput() {
        boolean isValid = false;
        if(isValidSize(this.numbers) && isValidNumber(this.numbers)) {
            isValid =  true;
        }
        return isValid;
    }

    private boolean isValidSize(final String numbers) {
        if(numbers.length() == NUMBERS_SIZE) {
            return true;
        }else {
            throw new InvalidInputException();
        }
    }

    private boolean isValidNumber(final String numbers) {
        try{
            Integer.parseInt(numbers);
            return true;
        }catch (NumberFormatException e) {
            throw new InvalidInputException();
        }
    }

}
