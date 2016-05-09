

/**
 * lin <<http://www.codewars.com/kata/559590633066759614000063/train/java>>
 *
 * Created by Anton on 09.05.16.
 */

public class MinMax {

    public static int[] minMax(int[] arr) {
        sorted(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        return new int[]{min, max};
    }


    public static int[] sorted(int[] arr) {
        int temp;

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;
    }
}
