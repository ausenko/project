import java.util.Random;

/**
 * @author Ievgen Usenko
 */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    /**
     * Generates array which size is {@code n} and populates it with random values.
     *
     * @param n size of array to generate, must not be negative.
     * @return new instance of the {@code int[]}
     * @throws IllegalArgumentException in case of {@code n} is negative.
     */
    public static int[] generate(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid size of array " + n);
        }

        final Random rand = new Random();
        final int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(n);
        }
        return array;
    }


    /**
     * Checks whether passed array is ordered.
     *
     * @param array instance of array to check, must not be {@code null}.
     * @return {@code true} is array is order, {@code false} in other cases.
     * @throws NullPointerException in case of passed instance of array is {@code null}
     */
    public static boolean isOrdered(final int[] array) {
        if (array == null) throw new NullPointerException("Array must not be null");
        if (array.length == 0 || array.length == 1) return true;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) return false;
        }
        return true;
    }

    /**
     * Converts given instance of {@code array} to {@link String}.
     *
     * @param array instance of {@code array} to convert.
     * @return {@link String} representation of the array.
     */
    public static String toString(final int[] array) {
        if (array == null) return null;
        final StringBuilder sb = new StringBuilder();
        for (int value : array) {
            sb.append(", ").append(value);
        }
        return "[" + sb.toString().substring(1).trim() + "]";
    }

    public static void print(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("[" + i + "]" + " = " + array[i]);
        }
    }


    public static int[] merge(int[] array1, int m, int[] array2, int n) {

        if (array2 == null || n == 0) return array1;
        if (n < 0 || m < 0) throw new IllegalArgumentException("Invalid size argument array");
        if (m > array1.length || n > array2.length) throw new ArrayIndexOutOfBoundsException();


        for (int i = 0; i < n; i++) {
            array1[m + i] = array2[i];
        }
        return array1;
    }


    public static int[] sortArray(int[] array1) {
        if (array1 == null) {
            throw new NullPointerException("Array is null");
        }

        int tempVar = 0;
        for (int i = 0; i < array1.length; i++) {

            for (int j = i + 1; j < array1.length; j++) {
                if (array1[j] < array1[i]) {
                    tempVar = array1[i];
                    array1[i] = array1[j];
                    array1[j] = tempVar;
                }
            }
        }
        return array1;
    }


    public static void printMergeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }


    public static void main(String[] args) {
        System.out.println("Массив после слияния: ");
        printMergeArray(merge(new int[]{1, 2, 3, 4, 5, 0, 0, 0}, 5, new int[]{3, 2, 3, 0, 0}, 3));
        System.out.println();
        System.out.println("Массив после сортировки по возрастанию");
        printMergeArray(sortArray((merge(new int[]{1, 2, 3, 4, 5, 0, 0, 0}, 5, new int[]{3, 2, 3, 0, 0}, 3))));
    }
}