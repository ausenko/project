import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * lin <<http://www.codewars.com/kata/56b29582461215098d00000f/train/java >>
 * <p>
 * Created by Anton on 05.04.16.
 */
public class Kata {

    public static int[] pipeFix(int[] numbers) {

        int min = numbers[0];
        int max = numbers[numbers.length - 1];

        int length = max - min + 1;
        int[] resultArray = new int[length];
        for (int i = 0; i < length; i++) {
            resultArray[i] = min;
            min++;

        }


        return resultArray;
    }


    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]" + " = " + array[i]);
        }

    }


    public static void main(String[] args) {
        print(pipeFix(new int[]{1, 3, 5, 6}));
        System.out.println("-----------------");
        print(pipeFix(new int[]{-1, 3}));
    }


}
