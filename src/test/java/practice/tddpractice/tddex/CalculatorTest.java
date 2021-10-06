package practice.tddpractice.tddex;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void 더하기() {
        //given
        int a = 10;
        int b = 20;
        int a2 = 100;
        int b2 = 50;
        int a3 = 35;
        int b3 = 80;
        int a4 = 1;
        int b4 = 2;
        //when
        int result = Calculator.add(a, b);
        int result2 = Calculator.add(a2, b2);
        int result3 = Calculator.add(a3, b3);
        int result4 = Calculator.add(a4, b4);
        //then
        Assertions.assertThat(result).isEqualTo(30);
        Assertions.assertThat(result2).isEqualTo(150);
        Assertions.assertThat(result3).isEqualTo(115);
        Assertions.assertThat(result4).isEqualTo(3);
    }
}
