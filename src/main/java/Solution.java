/**
 * Created by zhenya on 20.12.15.
 */
public class Solution {

    public static int[] mergeArrays(int[] array1, int[] array2) {

        int len1 = array1.length;
        int len2 = array2.length;
        int len = len1 + len2;
        int[] result = new int[len];

        int iarray1 = 0;
        int iarray2 = 0;

        for (int i = 0; i < len; i++) {
            if (iarray1 == len1) {
                result[i] = array2[iarray2++];

            } else if (iarray2 == len2) {
                result[i] = array1[iarray1++];
            } else {
                if (array1[iarray1] < array2[iarray2]) {
                    result[i] = array1[iarray1++];
                } else {
                    result[i] = array2[iarray2++];
                }

            }
        }
        return result;

    }


    public static void print(int[] result) {

        for (int i = 0; i < result.length; i++) {
            System.out.println("[" + i + "]" + " = " + result[i]);
        }

    }

    public static void main(String[] args) {
        print(mergeArrays(new int[]{0, 2}, new int[]{1, 3}));
    }
}
