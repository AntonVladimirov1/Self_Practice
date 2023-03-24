package day16_NestedLoop;

import java.util.Scanner;

public class LoginPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name:");
        String u =input.next();

        System.out.println("Enter your password:");
        String p =input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){ //if entered correct cred.
            System.out.println("Logged in");
        }else {
            for (int i = 0; i < 3; i++) {
                if (i !=2) {    // after which iteration we want to warn about last attempt
                    System.err.println("Incorrect entry, please re enter:");
                }else{
                    System.err.println("This is your last attempt, please re enter:");
                }
                System.out.println("Enter your user name:");
                u =input.next();

                System.out.println("Enter your password:");
                p =input.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")){ // if after incorrect, entered correct cred.- "break" stops loop
                    System.out.println("You are logged in");
                    break;
                }
            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))){  // after all 3 incorrect attempts
                System.err.println("Your account is locked, please go shout at the mirror");
            }
        }
        input.close();

    }

    public static void LogIn2(String u, String p){
        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{
            System.out.println("Invalid credentials");
        }
    }
}
