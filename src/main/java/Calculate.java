import study.StringCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringCalculator calculator = new StringCalculator();
        int result = calculator.calculate(br.readLine());
        System.out.println("계산결과 : " + result);

    }
}
