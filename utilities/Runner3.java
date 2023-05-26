package utilities;

public class Runner3 {

    public static double magicDivision(int number, int divider) {
        if (number == 0) {
            return 0;
        }
        if (divider == 0) {
            throw new ArithmeticException("divider can not be 0");
        }
        int sign = 1;
        if (number < 0 && divider > 0 || number > 0 && divider < 0) {
            sign = -1;
        }

        number = Math.abs(number);
        divider = Math.abs(divider);
        int intCount = 0;
        while (number >= divider) {
            number -= divider;
            intCount++;
        }

        double decimalCount = 0;
        if (number!=0) {
            number = number * 10;
            while (number>=divider){
                number-=divider;
                decimalCount+=0.1;
            }
        }

        return (intCount+decimalCount)*sign;

    }

    public static void main(String[] args) {
        System.out.println(magicDivision(10, 20));
        System.out.println(magicDivision(6, -2));
        System.out.println(magicDivision(1, 2));
        System.out.println(magicDivision(8, 3));
    }

}
