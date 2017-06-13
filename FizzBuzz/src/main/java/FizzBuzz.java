/**
 * Created by jon on 12/06/17.
 */
public class FizzBuzz {
    public String play(int playedNumber) {

        if(playedNumber % 3 == 0 && playedNumber % 5 == 0) {
            return "fizzbuzz";
        }

        if(playedNumber % 3 == 0) {
            return "fizz";
        }

        if(playedNumber % 5 == 0) {
            return "buzz";
        }

        return Integer.toString(playedNumber);

    }
}
