import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by jon on 12/06/17.
 */

@RunWith(value = Parameterized.class)
public class RomanNumeralsTensTests {

    private RomanNumeralsConvertor _romanNumeralsConvertor;

    @Before
    public void Setup() {
        _romanNumeralsConvertor = new RomanNumeralsConvertor();
    }

    @Parameterized.Parameter(value = 0)
    public Integer valueToConvert;

    @Parameterized.Parameter(value = 1)
    public String expectedRomanNumerals;

    //Single parameter, use Object[]
    @Parameterized.Parameters(name = "{index}: value to convert - {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10, "X"},
                {15, "XV"},
                {43, "XLIII"},
                {49, "XLIX"},
                {63, "LXIII"},
                {99, "XCIX"},
                {-1, "ERROR"},
        });
    }

    @Test
    public void Should_Return_Correct_Conversion_For_10_To_99(){
        Assert.assertEquals(expectedRomanNumerals, _romanNumeralsConvertor.convert(valueToConvert));
    }

}
