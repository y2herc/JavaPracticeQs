import java.util.ArrayList;
import java.util.List;

/*
As the name may already reveal, it works basically like a Fibonacci, but summing the last 3 (instead of 2) numbers of the sequence to generate the next.
And, worse part of it, regrettably I won't get to hear non-native Italian speakers trying to pronounce it :(
 */
public class Tribonaci {
    public static double[] tribonacci(double[] s, int n)    {
        double[] result = initResult(s, n);
        for (int i = s.length; i < n; i++) {
            result[i] = result[i-1] + result[i-2] +result[i-3];
        }
        return result;
    }

    private static double[] initResult(double[] s, int n) {
        double[] result = new double[n];
        for (int i = 0; i < s.length && i < n; i++) {
            result[i] = s[i];
        }
        return result;
    }
}
