import java.util.Arrays;

/**
 * lin<<http://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/java >>
 * <p>
 * Created by Anton on 27.03.16.
 */
public class Kata {

    private static int count = 0;


    public static int[] giditize(int secondval) {


        int lengtharray = countnumber(secondval);
        int[] resultarray = new int[lengtharray];
        int index = 0;
        for (int i = 0; i < lengtharray; i++) {
            resultarray[index++] = secondval % 10;
            secondval = secondval / 10;

        }
        return resultarray;
    }


    public static int countnumber(int n) {
        while (n != 0) {
            n = (int) n / 10;
            count++;

        }
        return count;
    }


    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }


    public static void main(String[] args) {

        System.out.println(countnumber(348597));
        print(giditize(348597));
        System.out.println();
    }
}
