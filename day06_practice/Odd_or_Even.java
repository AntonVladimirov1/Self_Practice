package day06_practice;

public class Odd_or_Even {
    public static void main(String[] args) {

        // "Even" numbers are the numbers that are evenly divisible by 2 (remainder is zero)
        // "Odd" is opposite for "Even"

        int number= 99;

        boolean isEven= number % 2 == 0;
        /*
        when we divide a number by 2, if the remainder is 0, means the number is even
         */
        boolean isOdd= !isEven;
        /* when we divide a number by 2, if the remainder is NOT 0, means the number is Odd

         */

        System.out.println(number+" is an even number: "+ isEven);
        System.out.println(number+" is an odd number: "+ isOdd);

    }
}
