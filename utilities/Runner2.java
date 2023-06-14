package utilities;

public class Runner2 {

    public static boolean isPrime(int num){
        if (num<=1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int reverseInt(int number) {
        boolean isNegative = number < 0;
        if(isNegative){
            number = number * -1;
        }
        int reverse = 0;
        while (number >= 1) {
           int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        } return isNegative ? reverse*-1 : reverse;
    }

    public static int reversedNegative(int num){  // Reverse Integer (any)
        int reversed = 0;
        for (; num !=0; num /=10){
            int lastDigit = num % 10;
            reversed = reversed *10 + lastDigit;
        }
        return reversed;
    }


    public static void main(String[] args) {

        System.out.println("reversed " + reversedNegative(-654321));

        System.out.println(reverseInt(-1234567));

        System.out.println(isPrime(11));

        StringBuilder coolStuff = new StringBuilder("welcome");    //* very cool thing!!!
        System.out.println(coolStuff.reverse());
    }

}
