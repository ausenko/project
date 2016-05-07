/**
 * lin<<http://www.codewars.com/kata/525f47c79f2f25a4db000025/train/java>>     5
 * <p>
 * Created by Anton on 07.05.16.
 */
public class Kata {
    public static boolean validPhoneNumber(String phoneNumber) {


        for (int i = 0; i < phoneNumber.length(); ++i) {
            char charElement = phoneNumber.charAt(i);

            switch (i) {

                case 0:
                    if ('(' != charElement) {
                        return false;
                    }
                    break;
                case 4:
                    if (')' != charElement) {
                        return false;
                    }
                    break;
                case 5:
                    if (' ' != charElement) {
                        return false;
                    }
                    break;
                case 9:
                    if ('-' != charElement) {
                        return false;
                    }
                    break;
                default:
                    if (!Character.isDigit(charElement)) {
                        return false;
                    }

            }

        }
        return true;

    }


    public static void main(String[] args) {
        System.out.println(validPhoneNumber("(1111)555 2345)"));
        System.out.println(validPhoneNumber("(096)92 76 782"));

    }


}
