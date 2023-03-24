package day09_Scanner;

import java.util.Scanner;

public class Scanner_Intro4 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        //System.out.println("Enter a character: ");
        //char ch= input.next().charAt(0);

        //System.out.println("You have entered: "+ch);

        System.out.println("Would you like to continue?");
        String answer= input.nextLine(); // provide entire line

        System.out.println("You have entered: \n"+answer);


    }
}
