package day15_WhileLoop;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min= 2147483647;
        int max = -2131654155;

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter number:");
            int num =input.nextInt();

            if (num < min){
                min = num ;
            }else if (num > max){
                    max = num;
            }
        }
        System.out.println("minimum number: "+min+"\nmaximum number: "+max);
        input.close();
    }
}
