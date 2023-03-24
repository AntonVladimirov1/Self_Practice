package day15_WhileLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

          int max = -2131654155;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number:");
            int num =input.nextInt();

            if (num > max){
                max = num;
            }
        }
        System.out.println("maximum number is:  = "+max);
    }
}
