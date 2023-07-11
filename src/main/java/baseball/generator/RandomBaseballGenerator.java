package baseball.generator;

import baseball.domain.Baseball;
import generator.RandomBallGenerator;

import java.util.ArrayList;
import java.util.List;

public class RandomBaseballGenerator implements RandomBallGenerator {

    @Override
    public List<Baseball> generate() {
        List<Baseball> baseballs = new ArrayList<>();
        for (int position = 1; position <= BASEBALL_SIZE; position++) {
            Baseball baseball = new Baseball(position, getBallNumber(MAX_NUMBER));
            baseballs.add(baseball);
        }
        return baseballs;
    }

    @Override
    public int getBallNumber(int number) {
        return random.nextInt(number) + 1;
    }
}
