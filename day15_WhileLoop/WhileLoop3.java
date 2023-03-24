package day15_WhileLoop;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter your first number:");
        double num1= input.nextDouble();

        System.out.println("Enter your second number:");
        double num2= input.nextDouble();

        System.out.println("Enter your math operator:");
        char operator = input.next().charAt(0);

        while (!(operator=='+' || operator=='-' || operator=='*' || operator=='/')){
            System.err.println("Invalid operator. Please re-enter");
            operator = input.next().charAt(0);
        }
        System.out.println((operator=='+')? num1+num2 :(operator=='-')? num1-num2 :(operator=='*')? num1*num2 : num1/num2);
                    input.close();
    }
}
