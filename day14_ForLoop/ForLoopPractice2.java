package day14_ForLoop;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int sum =0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            sum +=input.nextInt();
        }
        System.out.println("sum = "+sum);
    }

}
