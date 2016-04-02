/**
 * <<http://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java >>
 *
 *
 * Created by Anton on 1.03.16.
 */
public class FindOutlier {

    static int find(int[] integers) {
        int evenValue = findEven(integers);
        int oddValue = findOdd(integers);
        int count = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                count++;
                if (count >= 2) {
                    return oddValue;
                }
            }
            if (integers[i] % 2 != 0) {
                count++;
                if (count >= 2) {
                    return evenValue;
                }
            }
        }
        return 0;

    }


    static int findEven(int[] integers) {
        int even = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                even = integers[i];
                if (even == Integer.MAX_VALUE) {
                    return 0;
                }
            }
        }
        return even;
    }


    static int findOdd(int[] integers) {
        int odd = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0) {
                odd = integers[i];
                if (odd == Integer.MAX_VALUE) {
                    return 0;
                }
            }
        }
        return odd;
    }


    public static void main(String[] args) {
        System.out.println("Четные значения: ");
        System.out.println(findEven(new int[]{1, 2, 3, 5, 7}));
        System.out.println(findEven(new int[]{23, 4, 5, 7, 9, 11}));
        System.out.println(findEven(new int[]{1, 1, 6}));
        System.out.println("Нечетные значения: ");
        System.out.println(findOdd(new int[]{Integer.MAX_VALUE, 0, 1}));
        System.out.println(findOdd(new int[]{1, 2, 2}));
        System.out.println(findOdd(new int[]{2, 4, 5, 6, 8, 10}));


    }
}
