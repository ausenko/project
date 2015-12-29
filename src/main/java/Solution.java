/**
 * Created by zhenya on 30.12.15.
 */
public class Solution {

    public int[] merge(final int[] array1, final int[] array2) {

        int len1 = array1.length;
        int len2 = array2.length;
        int len = len1 + len2;
        int[] array = new int[len];


        int iarray1 = 0;
        int iarray2 = 0;


        for (int index = 0; index < len; index++) {
            if (iarray1 < len1) {
                array[index] = array1[iarray1++];
            } else if (iarray2 < len2) {
                array[index] = array2[iarray2++];
            }
        }

        return array;
    }


    public int[] sort(int[] array) {

        int temp = 0;

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }


    public int[] mergeArrays(int[] array1, int[] array2) {

        return sort(merge(array1, array2));

    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]" + "=" + array[i]);
        }
    }


    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.print(sl.mergeArrays(new int[]{2, 3, 0}, new int[]{4, 6, 5}));
    }
}
