package day11_StringMethods;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first email address");
        String email = scan.nextLine();

        String firstName,
                lastName;
        if (email.contains("_")) {
            firstName = email.substring(0, email.indexOf("_"));
            lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            System.out.println("Your new email address is:\n " + lastName + "_" + firstName + email.substring(email.indexOf("@"))
            );
        } else {
            System.out.println("Your email address is:\n" + email);
        }
    }
}
