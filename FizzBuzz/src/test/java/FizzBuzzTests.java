import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jon on 12/06/17.
 */
public class FizzBuzzTests {

    @Test
    public void If_The_Input_Is_1_Then_The_Output_Is_1() {
        String expectedOutput = "1";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualOutput = fizzBuzz.play(1);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_The_Input_Is_2_Then_The_Output_Is_2() {
        String expectedOutput = "2";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualOutput = fizzBuzz.play(2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_The_Input_Is_3_Then_The_Output_Is_Fizz() {
        String expectedOutput = "fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualOutput = fizzBuzz.play(3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_The_Input_Is_4_Then_The_Output_Is_4() {
        String expectedOutput = "4";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualOutput = fizzBuzz.play(4);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_The_Input_Is_5_Then_The_Output_Is_Buzz() {
        String expectedOutput = "buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualOutput = fizzBuzz.play(5);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_The_Input_Is_6_Then_The_Output_Is_Fizz() {
        String expectedOutput = "fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualOutput = fizzBuzz.play(6);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_The_Input_Is_10_Then_The_Output_Is_Buzz() {
        String expectedOutput = "buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualOutput = fizzBuzz.play(10);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_The_Input_Is_15_Then_The_Output_Is_FizzBuzz() {
        String expectedOutput = "fizzbuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualOutput = fizzBuzz.play(15);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void If_The_Input_Is_30_Then_The_Output_Is_FizzBuzz() {
        String expectedOutput = "fizzbuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualOutput = fizzBuzz.play(30);
        assertEquals(expectedOutput, actualOutput);
    }



}
