/**
 * Created by jon on 12/06/17.
 */
public class Fibonacci {
    public static long calculateSlow(int sequence) {
        if(sequence == 0 || sequence == 1) return sequence;
        return (calculateSlow(sequence - 1) + calculateSlow(sequence -2));
    }

    public static long calculateFast(int sequence) {
        if(sequence == 0 || sequence == 1) return sequence;

        long a = 0;
        long b = 1;

        for(int i = 2; i <= sequence; i++){
            long sum = a + b;
            a = b;
            b = sum;
        }

        return b;

    }
}
