
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * lin <<http://www.codewars.com/kata/55c6126177c9441a570000cc/train/java>>
 * Created by Anton on 23.05.16.
 */
public class WeightSort {

    public static String orderWeight(String strng) {


        String[] stringArray = strng.split(" ");
        List<String> strList = new ArrayList<String>();
        String resultString = " ";


        for (String str : stringArray) {
            strList.add(str);
        }
        Collections.sort(strList, new WeightComparator());
        for (String str : strList) {
            resultString = resultString + str + " ";
        }

        return resultString.trim();
    }


    public static void main(String[] args) {
        System.out.println(orderWeight("20 30 78 99 100"));
    }
}


class WeightComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        if (sumOfDigit(str1) < sumOfDigit(str2)) {
            return -1;
        } else if (sumOfDigit(str1) > sumOfDigit(str2)) {
            return 1;
        } else return str1.compareTo(str2);
    }


    public static int sumOfDigit(String str) {

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }


}











