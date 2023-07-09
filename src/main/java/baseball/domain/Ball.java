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
        int num = random.nextInt(MAX_NUMBER-1) + MIN_NUMBER; // (0~8)+1 = 1~9 랜덤 숫자
        return num;
    }

    public String getNumber() {
        return number;
    }
}
