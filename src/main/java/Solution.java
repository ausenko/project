/**
 * Created by Anton 19.01.16.
 */
public class Solution {


    public int isSearchMaxValue(int[] array) {
        if (array.length == 0) throw new IllegalArgumentException(" Массив нулевой длины ");

        int indexmax = 0;
        int firstelement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > firstelement) {
                firstelement = array[i];
                indexmax = i;
            }
        }
        return array[indexmax];

    }


    public int isZeroFirstMax(int[] array) {
        int firstmax = isSearchMaxValue(array);
        firstmax = 0;

        return firstmax;
    }


    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]" + " = " + array[i]);
        }
    }


    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.print((new int[]{2, 1, 3, 10, 3, 4, 7, 9, 4}));
        System.out.println("Максимальный элемент массива");
        System.out.println(sl.isSearchMaxValue(new int[]{2, 1, 3, 10, 3, 4, 7, 9, 4}));
        System.out.println("Значение массива максимального элемента после переприсваивания = "
                + sl.isZeroFirstMax(new int[]{2, 1, 3, 10, 3, 4, 7, 9, 4}));

    }
}
