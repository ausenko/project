import java.math.BigInteger;

/**
 * Created by zhenya on 15.12.15.
 */
public class Solution {


    public int primeNumber(int endvalue) {

        boolean secondtype = false;


        for (int i = 2; i <= endvalue; i++) {
            for (int j = 2; j < i; j++) {
                secondtype = (i % j == 0);
                if (secondtype) break;
            }
            if (!secondtype) {
                System.out.print(i + ", ");

            }
        }
        return endvalue;
    }


    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.primeNumber(25);
    }


}
