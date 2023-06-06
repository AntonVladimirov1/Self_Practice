package utilities;

import java.util.Arrays;

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
        int lastDigit;
        while (number >= 1) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        } return isNegative ? reverse*-1 : reverse;
    }
    public static int[] makeLast(int[] nums){
        int last = nums[nums.length-1];
        int[] newArray = new int[nums.length*2];
        newArray[newArray.length-1]= last;
        return newArray;
    }


    public static void main(String[] args) {

        int[] mums ={3,4};
        System.out.println(Arrays.toString(makeLast(mums)));

        System.out.println(reverseInt(-1234567));

        System.out.println(isPrime(11));

        StringBuilder coolStuff = new StringBuilder("welcome");    //* very cool thing!!!
        System.out.println(coolStuff.reverse());
    }

}
