import java.util.ArrayList;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;

/**
 * <<http://www.codewars.com/kata/5539fecef69c483c5a000015/train/java>>
 * Created by Anton on 16.04.16.
 */
public class BackWardsPrime {


    public static String backwardsPrime(long start, long end) {
        if ( start <= 0 || start > Long.MAX_VALUE) return "";
        ArrayList<Integer> arrayList = getPalindromeValue(getPrimeValue(start, end));
        if (arrayList.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i));
            sb.append(" ");
        }
        String result = sb.substring(0, (sb.length() - 1));
        return result;

    }


    public static ArrayList<Long> getPrimeValue(long start, long end) {
        ArrayList<Long> arrayList = new ArrayList<Long>((int) end);
        for (long i = start; i <= end; i++) {
            if (i <= 10) continue;
            if (isPrime(i)) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }


    public static boolean isPrime(long end) {
        if (end == 1) {
            return false;
        }
        for (long i = 2; i * i <= end; i++) {
            if (end % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static long revers(long value) {
        long rev = 0;
        while (value != 0) {
            rev = rev * 10 + value % 10;
            value /= 10;
        }
        return rev;
    }


    public static ArrayList<Integer> getPalindromeValue(ArrayList<Long> arrayList) {

        long revValue;
        int capacity = arrayList.size();
        ArrayList<Integer> resultArray = new ArrayList<>(capacity);
        for (int i = 0; i < arrayList.size(); i++) {
            revValue = revers(arrayList.get(i));

            if (arrayList.get(i) != revValue && isPrime(revValue)) {
                resultArray.add(arrayList.get(i).intValue());
            }
        }
        return resultArray;
    }


    public static void main(String[] args) {
        System.out.println(getPrimeValue(2, 100));
        System.out.println("----------------------------------------------------------");
        System.out.println(backwardsPrime(2, 100));
    }

}

