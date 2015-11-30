import static java.lang.Integer.parseInt;


/**
 * Created by Anton
 * on 30.11.15.
 */
public class ConversionType {


    public int conversionTypeTOint(String i) {
        int b = 0;
        int a = parseInt(i);
        String temp = "";
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a /= 2;
        }
        return parseInt(temp);


    }


    public String conversionTypeToString(int i) {
        int b = 0;
        String temp = "";
        while (i != 0) {
            b = i % 2;
            temp = b + temp;
            i /= 2;
        }
        return temp;
    }


    public static void main(String[] args) {
        ConversionType cn = new ConversionType();
        System.out.println(cn.conversionTypeTOint("8"));
        System.out.println(cn.conversionTypeToString(4));
    }


}
