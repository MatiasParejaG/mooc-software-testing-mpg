package tudelft.sum;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {
    private TwoNumbersSum sumCalculator = new TwoNumbersSum();

    @Test
    void testBasicAddition() {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1, 2)); // 12
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(3, 4)); // 34
        ArrayList<Integer> result = sumCalculator.addTwoNumbers(num1, num2);
        assertEquals(Arrays.asList(4, 6), result); // 12 + 34 = 46
    }

    @Test
    void testAdditionWithCarry() {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(9, 9)); // 99
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1));    // 1
        ArrayList<Integer> result = sumCalculator.addTwoNumbers(num1, num2);
        assertEquals(Arrays.asList(1, 0, 0), result); // 99 + 1 = 100
    }

    @Test
    void testDifferentLengthNumbers() {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(2, 0, 0)); // 200
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(5, 0));   // 50
        ArrayList<Integer> result = sumCalculator.addTwoNumbers(num1, num2);
        assertEquals(Arrays.asList(2, 5, 0), result); // 200 + 50 = 250
    }
}