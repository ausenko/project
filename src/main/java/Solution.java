/**
 * Created by Anton on 19.12.15.
 */
public class Solution {


    public static boolean isPrime(int value) {
        if (value == 1) return false;


        for (int i = 2; i * i < value; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) System.out.print(i + ", ");
        }
    }

}
