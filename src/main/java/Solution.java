/**
 * Created by Anton on 18.11.15.
 */
public class Solution {
    public static int lengthOFLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        char[] str = s.toCharArray();
        int count = 0;
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z') {
                count++;
            }
            if (str[i] == ' ') {
                if (count == 0) {
                    continue;
                } else {
                    return count;
                }
            }
        }
        return count;


    }


}
