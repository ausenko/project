
import static java.lang.Integer.parseInt;

/**
 * Created by Anton on 02.12.15.
 */

public class ConversionType {

    public String conversionTypeToString(int num) {

        String temp = "";
        while (num > 0) {
            temp = (num & 1) + temp;
            num = num >> 1;
        }
        return temp;
    }


    public int conversionTypeToInteger(String num) {
        String temp = "";
        int a = parseInt(num);
        while (a > 0) {
            temp = (a & 1) + temp;
            a = a >> 1;

        }
        return parseInt(temp);
    }


    public static void main(String[] args) {
        ConversionType cn = new ConversionType();
        System.out.println(cn.conversionTypeToString(4));
        System.out.println(cn.conversionTypeToInteger("8"));

    }

}
