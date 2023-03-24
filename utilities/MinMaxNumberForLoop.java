package utilities;

import java.util.Scanner;

public class MinMaxNumberForLoop {

    public static String minMaxNum(){
        String result="";
        Scanner input = new Scanner(System.in);

        int totalNumbers = 5;
        int number;
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 1; i <= totalNumbers; i++) {
            System.out.println("Enter number " + i + ": ");
            number = input.nextInt();

            if (number > maximum) {
                maximum = number;
            }
            if (number < minimum) {
                minimum = number;
            }
            result = "Maximum number is: " + maximum +"\nMinimum number is: " + minimum;
        }
        System.err.println(result);
        input.close();
        return result;
    }
}
