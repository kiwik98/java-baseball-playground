package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringCalculatorTest {

    private StringCalculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }

    @Test
    void calculate() {
        final String fomula = "2+3*4/2";
        Assertions.assertThat(calculator.calculate(fomula)).isEqualTo(10);
    }
}
