package utilities;

import java.util.Scanner;

public class Runner3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first  number");
        int a = input.nextInt();

        System.out.println("Enter second  number");
        int b = input.nextInt();


        int result = 0;

        while (a >= b) {
            a = a- b;
            result = result + 1;
        }
        System.out.println("Divide is : " + result);
    }

}
