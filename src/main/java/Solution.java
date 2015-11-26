/**
 * Created by Anton on 23.11.15.
 */
public class Solution {
    private String version1;
    private String version2;



    public String newVersionString(String format) {
       if (format == null) return null;

        String newversion = format.replace(".", "");
        return newversion;
    }


    public double newTypeVersion(String str) {

        double d = 0;
        d = Double.parseDouble(newVersionString(str));
        return d;
    }


    public static void main(String[] args) {

        Solution sl = new Solution();
        sl.version1 = "-1.0.1";
        sl.version2 = "0.01.0.0";

        System.out.println(sl.newVersionString(sl.version1));
        System.out.println(sl.newVersionString(sl.version2));
        System.out.println(sl.newTypeVersion(sl.version1));
        System.out.println(sl.newTypeVersion(sl.version2));


    }



}
