package day15_WhileLoop;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter your age:");
        int age =input.nextInt();

        while(!(age>=1 && age<=120)){
            System.err.println("Invalid entry. Please re-enter:");
           age = input.nextInt();
        }

        System.out.println("Are you a US citizen?");
        String yesNo =input.next().toLowerCase();

        while (!(yesNo.equals("yes") || yesNo.equals("no")) ){
            System.err.println("Invalid entry. Please re-enter");
            System.out.println("Are you a US citizen?");
            yesNo =input.next().toLowerCase();
        }
        if (age>=21 && yesNo.equals("yes")){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }
        input.close();
    }
}
