package study;


import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    private final String add = "+";
    private final String subtract = "-";
    private final String divide = "/";
    private final String multiply = "*";
    private final List<String> signs = new ArrayList<>();
    private final List<Integer> numbers = new ArrayList<>();

    public int calculate(final String fomula) {
        final String[] values = fomula.split("");
        convertFomula(values);

        int result = 0;

        for(int i = 0; i < numbers.size(); i++) {
            if(i == 0) {
                result = numbers.get(i);
            }else{
                result = cal(signs.get(i-1), result, numbers.get(i));
            }

        }
        return result;
    }

    private int cal(final String sign, final int number1, final int number2) {
        switch (sign) {
            case add :
                return number1 + number2;
            case subtract :
                return number1 - number2;
            case divide :
                return number1 / number2;
            case multiply :
                return number1 * number2;
            default:
                throw new IllegalStateException("Unexpected value: " + sign);
        }
    }

    private void convertFomula(final String[] values) {
        for(String value : values) {

            if (value.equals(add) || value.equals(subtract) || value.equals(divide) || value.equals(multiply)) {
                signs.add(value);
            }else {
                numbers.add(Integer.parseInt(value));
            }

        }
    }
}
