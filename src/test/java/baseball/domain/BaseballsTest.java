package baseball.domain;

import baseball.generator.InputBaseballGenerator;
import baseball.generator.RandomBaseballGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class BaseballsTest {

    @Test
    void 볼_생성() {
        Baseballs balls = new Baseballs();

        assertThat(balls.getBalls()).isNull();

        balls.generateBalls(new RandomBaseballGenerator());

        assertThat(balls.getBalls()).isNotNull();
    }

    @Test
    void 볼_직접_생성() {
        //given
        Baseballs baseballs = new Baseballs();
        //when
        baseballs.generateBalls(new InputBaseballGenerator("123"));
        List<Baseball> balls = baseballs.getBalls();
        List<Baseball> expectedBalls = IntStream.range(0, 3)
                .mapToObj(i -> new Baseball(i + 1, i + 1))
                .collect(Collectors.toList());
        //then
        assertIterableEquals(balls, expectedBalls);
    }

}