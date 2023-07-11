package baseball.domain;

import baseball.generator.RandomBaseballGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BaseballsTest {

    @Test
    void 랜덤_볼_생성() {
        Baseballs balls = new Baseballs();
        assertThat(balls.getBalls()).isNull();
        balls.generateBalls(new RandomBaseballGenerator());
        assertThat(balls.getBalls()).isNotNull();
    }
}