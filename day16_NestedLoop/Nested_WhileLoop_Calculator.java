package day16_NestedLoop;

import java.util.Scanner;

public class Nested_WhileLoop_Calculator {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number:");
            while (!input.hasNextDouble()){
                System.err.println("Invalid. Enter number only! Re-enter:");
                input.next();
            }
            double first = input.nextDouble();

            System.out.println("Enter second number:");
            while (!input.hasNextDouble()){
                System.err.println("Invalid. Enter number only! Re-enter:");
                input.next();
            }
            double second = input.nextDouble();

            System.out.println("Enter operator:");
            String operator = input.next();

            while (!((operator.equals("+")) || (operator.equals("-")) || (operator.equals("*")) || (operator.equals("/")))) {
                System.err.println("Invalid operator, re-enter:");
                operator =input.next();
            }

            switch (operator) {
                case "+":
                    System.out.println("RESULT: " + (first + second));
                    break;
                case "-":
                    System.out.println("RESULT: " + (first - second));
                    break;
                case "*":
                    System.out.println("RESULT: " + (first * second));
                    break;
                default:
                    System.out.println("RESULT: " + (first / second));
                    break;
            }
            System.out.println("Would you like to continue? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {      // while the user provides invalid answer
                System.err.println("Invalid Entry! Would you like to continue? Yes/No");
                answer = input.next().toLowerCase();
            }
            if (answer.equals("no")) {
                break;
            }
        }
        input.close();


    }
}
