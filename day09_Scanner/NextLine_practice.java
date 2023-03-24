package day09_Scanner;

import java.util.Scanner;

public class NextLine_practice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your full name:");
        String full_name= input.nextLine();

        System.out.println("Enter your school name:");
        String school_name= input.nextLine();

        System.out.println("Enter your gender:");
        String gender= input.next();

        System.out.println("Enter your age:");
        int age= input.nextInt();

        input.nextLine(); // clear out the scanner
        // need this additional here before nextLine method if "NextLine" goes after another method

        System.out.println("Describe your self:");
        String desc= input.nextLine();





    }
}
