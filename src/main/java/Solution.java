import java.math.BigInteger;

/**
 * Created by zhenya on 15.12.15.
 */
public class Solution {


    public static boolean isPrime(int endvalue) {
        if (endvalue == 1) {
            return false;
        }
        for (int i = 2; i * i <= endvalue; i++) {
            if (endvalue % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println();
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) System.out.print(i + ", ");
        }
    }


}
