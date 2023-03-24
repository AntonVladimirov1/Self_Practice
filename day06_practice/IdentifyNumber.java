package day06_practice;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number= 0;

        boolean isPositive= number >0;
        boolean isNegative= number <0;
        boolean isZero= !isPositive && !isNegative;

        System.out.println(number+" is Positive number: "+ isPositive);
        System.out.println(number+" is Negative number: "+ isNegative);
        System.out.println(number+" is Zero number: "+ isZero);

    }
}
