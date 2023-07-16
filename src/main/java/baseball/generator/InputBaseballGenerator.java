package baseball.generator;

import baseball.domain.Baseball;
import generator.BallGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InputBaseballGenerator implements BallGenerator {

    private final List<Integer> numbers;

    public InputBaseballGenerator(String numbers) {
        List<Integer> result = new ArrayList<>();
        String[] chars = numbers.split("");
        for(String s : chars) {
            result.add(Integer.parseInt(s));
        }
        this.numbers = result;
    }

    @Override
    public List<Baseball> generate() {
        return numbers.stream()
                .map(number -> new Baseball(numbers.indexOf(number) + 1, number))
                .collect(Collectors.toList());
    }

}
