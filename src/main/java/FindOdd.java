import java.util.TreeSet;

/**
 * lin<http://www.codewars.com/kata/54da5a58ea159efa38000836/train/java>>
 * Created by Anton on 09.05.16.
 */
public class FindOdd {
    public static int findIt(int[] A) {
        final TreeSet<Integer> set = new TreeSet<>();
        for (int x : A) {
            if (set.contains(x)) {
                set.remove(x);
            } else {
                set.add(x);
            }
        }
        return set.first();
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
    }
}
