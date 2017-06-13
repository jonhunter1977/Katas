/**
 * Created by jon on 12/06/17.
 */
public class RomanNumeralsConvertor {

    public static final String[] SINGLES = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    public static final String[] TENS = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    public static final String[] HUNDREDS = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    public static final String[] THOUSANDS = new String[]{"", "M", "MM", "MMM", "", "", "", "", "", ""};

    public String convert(Integer numberToConvert) {

        if (numberToConvert > 3999 || numberToConvert < 0) return "ERROR";

        StringBuilder numberToConvertAsString = new StringBuilder(Integer.toString(numberToConvert)).reverse();
        String[] numberBits = numberToConvertAsString.toString().split("");
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < numberBits.length; i++) {
            Integer val = Integer.parseInt(numberBits[i]);
            if(i == 0) output.insert(0, SINGLES[val]);
            if(i == 1) output.insert(0, TENS[val]);
            if(i == 2) output.insert(0, HUNDREDS[val]);
            if(i == 3) output.insert(0, THOUSANDS[val]);
        }

        return output.toString();
    }
}
