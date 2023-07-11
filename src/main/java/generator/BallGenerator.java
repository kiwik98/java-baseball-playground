package generator;

import java.util.List;

public interface BallGenerator<E> {
    int MAX_NUMBER = 9;
    int BASEBALL_SIZE = 3;
    List<E> generate();

    int getBallNumber(int number);
}
