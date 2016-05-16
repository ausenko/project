/**
 *
 * lin <<http://www.codewars.com/kata/561e9c843a2ef5a40c0000a4/train/java >>
 * Created by Anton on 16.05.16.
 */
public class GapInPrimes {


    public static long[] gap(int g, long m, long n) {

        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    return new long[]{last, i};
                }
                last = i;
            }
        }
        return null;
    }


    public static boolean isPrime(long value) {
        if (value == 1) {
            return false;
        }

        for (long i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void print(long[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]" + " = " + array[i]);
        }

    }


    public static void main(String[] args) {
        print((gap(2, 100, 110)));
    }


}
