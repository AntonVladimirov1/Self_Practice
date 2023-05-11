package day38_Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw_keyword {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();

        if (age<0 || age>150){
            throw new InputMismatchException("Invalid age beeeee"); //* can write down any message
        }

    }
}