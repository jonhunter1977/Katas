import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jon on 12/06/17.
 */
public class FibonacciTests {

    @Test
    public void If_N_Equals_0_Then_Output_Equals_0() {
        long expectedOutput = 0;
        long actualOutput = Fibonacci.calculateSlow(0);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_N_Equals_1_Then_Output_Equals_1() {
        long expectedOutput = 1;
        long actualOutput = Fibonacci.calculateSlow(1);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_N_Equals_2_Then_Output_Equals_1() {
        long expectedOutput = 1;
        long actualOutput = Fibonacci.calculateSlow(2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_N_Equals_3_Then_Output_Equals_2() {
        long expectedOutput = 2;
        long actualOutput = Fibonacci.calculateSlow(3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_N_Equals_4_Then_Output_Equals_3() {
        long expectedOutput = 3;
        long actualOutput = Fibonacci.calculateSlow(4);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_N_Equals_5_Then_Output_Equals_5() {
        long expectedOutput = 5;
        long actualOutput = Fibonacci.calculateSlow(5);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_N_Equals_20_Then_Output_Equals_6765() {
        long expectedOutput = 6765;
        long actualOutput = Fibonacci.calculateSlow(20);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_N_Equals_50_Then_Output_Equals_12586269025() {
        long expectedOutput = 12586269025L;
        long actualOutput = Fibonacci.calculateFast(50);
        assertEquals(expectedOutput, actualOutput);
    }

}
