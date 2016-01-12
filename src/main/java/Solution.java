/**
 * Created by Anton on 11.01.16.
 */
public class Solution {

    private int naturalnumber;


    public int[] generate(int naturalnumber) {

        int count = 0;
        int[] array = new int[naturalnumber];

        for (int i = 0; i < array.length; i++) {
            array[count++] = i;
        }
        return array;
    }


    public int[] pointValues(int[] array) {
        if (array == null) throw new NullPointerException("Array is null");


        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) count++;
        }


        int[] newarray = new int[count];
        int newcount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                newarray[newcount++] = i;
            }
        }
        return newarray;
    }


    public int[] EvenArrayOfValues(int[] newarray) {
        if (newarray.length == 0) {
            System.out.println("The array is not even values");
        }
        return newarray;
    }


    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]" + " = " + array[i]);
        }

    }


    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.print(sl.generate(16));
        System.out.println(" - - - - - - - - - - - ");
        sl.print(sl.EvenArrayOfValues(sl.pointValues(sl.generate(16))));

    }

}
