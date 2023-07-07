package baseball.domain;

import java.util.Random;

public class Ball {

    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 9;
    private String number;


    public Ball() {
    }

    private Ball(int number) {
        this.number = String.valueOf(number);
    }

    public Ball createBall() {
        return new Ball(createNumber());
    }

    private int createNumber() {
        Random random = new Random();
        boolean validNumber = false;
        int num = 0;
        while (!validNumber) {
            num = random.nextInt(MAX_NUMBER);
            validNumber = isValidNumber(num);
        }
        return num;
    }

    private boolean isValidNumber(int number) {
        if (number >= MIN_NUMBER && number <= MAX_NUMBER) {
            return true;
        }
        return false;
    }

    public String getNumber() {
        return number;
    }
}
