/**
 * lin<<http://www.codewars.com/kata/55ab4f980f2d576c070000f4/train/java>>
 * <p>
 * Created by Anton on 04.05.16.
 */
public class Suite2 {

    public static String game(long n) {

        String res = "[";
        long value = n * n;
        if (value % 2 == 0) {
            res = res + Long.toString(value / 2);
        } else {
            res = res + Long.toString(value) + "," + Long.toString(2);

        }
        return res + "]";

    }


    public static void main(String[] args) {
        System.out.println(game(1));
        System.out.println(game(8));
        System.out.println(game(0));
    }
}
