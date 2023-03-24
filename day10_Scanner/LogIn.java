package day10_Scanner;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        String correctUsername ="Kuku",
                correctPassword ="Locerr11@@";

        Scanner input =new Scanner(System.in);


        System.out.println("Enter your username");
        String username =input.nextLine();
        System.out.println("Enter your password");
        String password = input.nextLine();

        input.close();

        if (username.equals(correctUsername) && password.equals(correctPassword) ){
            System.out.println("Granted");
        }else {
            System.out.println("Incorrect");
        }

    }
}
