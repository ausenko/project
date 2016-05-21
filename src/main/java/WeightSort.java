/**
 *
 *  lin <<http://www.codewars.com/kata/55c6126177c9441a570000cc/train/java >>
 * Created by Anton on 19.05.16.
 */
public class WeightSort {

    public static String orderWeight(String strng) {

        String[] array = strng.split(" ");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (sumOfDigit(array[i]) > sumOfDigit(array[j])) {
                    String tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                } else if (sumOfDigit(array[i]) == sumOfDigit(array[j])) {
                    if (array[i].compareTo(array[j]) > 0) {
                        String tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }

        StringBuffer result = new StringBuffer();
        for (String i : array) {
            result.append(i + " ");
        }

        return result.toString().trim();


    }


    public static int sumOfDigit(String str) {

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;

    }


    public static void main(String[] args) {
        System.out.println(sumOfDigit("123"));
        System.out.println(orderWeight("20 30 78 99 100"));
    }
}