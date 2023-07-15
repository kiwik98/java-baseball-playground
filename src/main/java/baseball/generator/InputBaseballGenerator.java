package baseball.generator;

import baseball.domain.Baseball;
import generator.BallGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputBaseballGenerator implements BallGenerator {

    private final List<Integer> numbers;

    public InputBaseballGenerator(int n1, int n2, int n3) {
        this.numbers = Arrays.asList(n1, n2, n3);
    }

    @Override
    public List<Baseball> generate() {
        return numbers.stream()
                .map(number -> new Baseball(numbers.indexOf(number) + 1, number))
                .collect(Collectors.toList());
    }

}
