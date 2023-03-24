package day16_NestedLoop;

import java.util.Scanner;

public class Nested_WhileLoop {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        while (true){
            System.out.println("Enter a number:");
            int number =input.nextInt();

            if (number%2==0){
                System.err.println(number+" is Even");
            }else{
                System.err.println(number+" is Odd");
            }
            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){      // while the user provides invalid answer
                System.err.println("Invalid Entry!!! Would you like to enter another number? Yes/No");
               answer = input.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }
        }

    }
}
