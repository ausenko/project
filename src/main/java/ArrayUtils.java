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


    public static int[] sorted(int nums[] ){

        int temp = 0;

        for( int i = nums.length-1; i >= 0; i++ ){
            for( int j = 0; j < i; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }



    public static void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("[" + i + "]" + " = "+array[i]);
        }

    }

}
