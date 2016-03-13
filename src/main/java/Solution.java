/**
 * Created by zhenya on 13.03.16.
 * <p>
 * В римской системе цифры принимаю вид:
 * <p>
 * <p>
 * I: 1
 * IV: 4
 * V: 5
 * IX: 9
 * X: 10
 * XL: 40
 * L: 50
 * XC: 90
 * C: 100
 * CD: 400
 * D: 500
 * CM: 900
 * M: 1000
 */
public class Solution {

    public String intToRoman(int num) {

        String roman = "";
        int repeat;


        repeat = num / 1000;
        for (int i = 1; i <= repeat; i++) {
            roman = roman + "M";
        }
        num = num % 1000;

        repeat = num / 900;
        for (int i = 1; i <= repeat; i++) {
            roman = roman + "CM";
        }
        num = num % 900;

        repeat = num / 500;
        for (int i = 1; i <= repeat; i++) {
            roman = roman + "D";
        }
        num = num % 500;

        repeat = num / 400;
        for (int i = 1; i <= repeat; i++) {
            roman = roman + "CD";
        }
        num = num % 400;

        repeat = num / 100;
        for (int i = 1; i <= repeat; i++) {
            roman = roman + "C";
        }
        num = num % 100;

        repeat = num / 90;
        for (int i = 1; i <= repeat; i++) {
            roman = roman + "XC";
        }
        num = num % 90;

        repeat = num / 50;
        for (int i = 1; i <= repeat; i++) {
            roman = roman + "L";
        }
        num = num % 50;

        repeat = num / 40;
        for (int i = 1; i <= repeat; i++) {
            roman = roman + "XL";
        }
        num = num % 40;

        repeat = num / 10;
        for (int i = 1; i <= repeat; i++) {
            roman = roman + "X";
        }
        num = num % 10;

        repeat = num / 9;
        for (int i = 1; i <= repeat; i++) {
            roman = roman + "IX";
        }
        num = num % 9;

        repeat = num / 5;
        for (int i = 1; i <= repeat; i++) {
            roman = roman + "V";
        }
        num = num % 5;

        repeat = num / 4;
        for (int i = 1; i <= repeat; i++) {
            roman = roman + "IV";
        }
        num = num % 4;

        repeat = num / 1;
        for (int i = 1; i <= repeat; i++) {
            roman = roman + "I";
        }

        return roman;
    }


    public String intToRomansecond(int num) {
        String roman = "";
        int repeat = num / 1;
        int intvalue[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String symbol[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        //repeat=num/1;
        for (int x = 0; num > 0; x++) {
            repeat = num / intvalue[x];
            for (int i = 1; i <= repeat; i++) {
                roman = roman + symbol[x];
            }
            num = num % intvalue[x];
        }
        return roman;
    }


    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.intToRoman(12));
        System.out.println(sl.intToRoman(999));

        System.out.println(sl.intToRomansecond(1));
        System.out.println(sl.intToRomansecond(21));
    }
}
