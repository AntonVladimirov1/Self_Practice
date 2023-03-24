package day09_Scanner;

import java.util.Scanner; //or can import everything import java.util.*;

public class Scanner_Intro {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in); //for reading user input
        System.out.println("Enter a number!");

        //byte num1= input.nextByte();
        short num1= input.nextShort();
        System.out.println("You entered: "+num1);

    }
}
