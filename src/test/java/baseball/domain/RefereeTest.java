package baseball.domain;

import baseball.generator.InputBaseballGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RefereeTest {

    private Baseballs computerBalls;
    private Baseballs inputBalls;
    private Referee referee;

    @BeforeEach
    void setUp() {
        computerBalls = new Baseballs();
        inputBalls = new Baseballs();
        referee = new Referee();
    }

    @Test
    void 낫싱() {
        //given
        computerBalls.generateBalls(new InputBaseballGenerator(1,2,3));
        inputBalls.generateBalls(new InputBaseballGenerator(4,5,6));
        BaseballCount nothingResult = new BaseballCount(0, 0);
        //when
        BaseballCount judgeResult = referee.judge(computerBalls, inputBalls);
        //then
        Assertions.assertThat(nothingResult.getStrike()).isEqualTo(judgeResult.getStrike());
        Assertions.assertThat(nothingResult.getBall()).isEqualTo(judgeResult.getBall());
    }

    @Test
    void 원_볼() {
        //given
        computerBalls.generateBalls(new InputBaseballGenerator(1,2,3));
        inputBalls.generateBalls(new InputBaseballGenerator(3,5,6));
        BaseballCount nothingResult = new BaseballCount(0, 1);
        //when
        BaseballCount judgeResult = referee.judge(computerBalls, inputBalls);
        //then
        Assertions.assertThat(nothingResult.getStrike()).isEqualTo(judgeResult.getStrike());
        Assertions.assertThat(nothingResult.getBall()).isEqualTo(judgeResult.getBall());
    }

    @Test
    void 원_스트라이크() {
        //given
        computerBalls.generateBalls(new InputBaseballGenerator(1,2,3));
        inputBalls.generateBalls(new InputBaseballGenerator(1,5,6));
        BaseballCount nothingResult = new BaseballCount(1, 0);
        //when
        BaseballCount judgeResult = referee.judge(computerBalls, inputBalls);
        //then
        Assertions.assertThat(nothingResult.getStrike()).isEqualTo(judgeResult.getStrike());
        Assertions.assertThat(nothingResult.getBall()).isEqualTo(judgeResult.getBall());
    }

    @Test
    void 원_볼_원_스트라이크() {
        //given
        computerBalls.generateBalls(new InputBaseballGenerator(1,2,3));
        inputBalls.generateBalls(new InputBaseballGenerator(1,3,6));
        BaseballCount nothingResult = new BaseballCount(1, 1);
        //when
        BaseballCount judgeResult = referee.judge(computerBalls, inputBalls);
        //then
        Assertions.assertThat(nothingResult.getStrike()).isEqualTo(judgeResult.getStrike());
        Assertions.assertThat(nothingResult.getBall()).isEqualTo(judgeResult.getBall());
    }
}
