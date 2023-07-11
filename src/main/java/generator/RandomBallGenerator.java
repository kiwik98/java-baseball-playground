package generator;

import java.util.Random;

public interface RandomBallGenerator<E> extends BallGenerator<E>{

    Random random = new Random();

    int getBallNumber(int number);
}
