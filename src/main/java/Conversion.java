import static java.lang.Integer.parseInt;

/**
 * Created by Anton on 26.11.15.
 */
public class Conversion {


    public String conversionIntegerToBinaryString(int i) {

        String s = Integer.toBinaryString(i);
        return s;

    }

    public int conversionStringToBinaryInteger(String s) {

        int a = parseInt(s);
        String sb = Integer.toBinaryString(a);
        return parseInt(sb);

    }


    public static void main(String[] args) {

        Conversion cn = new Conversion();
        System.out.println(cn.conversionIntegerToBinaryString(2));
        System.out.println(cn.conversionStringToBinaryInteger("4"));
    }

}
