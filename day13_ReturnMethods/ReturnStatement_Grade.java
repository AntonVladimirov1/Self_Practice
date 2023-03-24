package day13_ReturnMethods;

import java.util.Scanner;

public class ReturnStatement_Grade {
    public static void main(String[] args) {


        char grade =new Scanner(System.in).next().charAt(0);

        boolean isValid = grade =='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F';
        if (!isValid){
            System.out.println("Invalid grade");
            return; // if boolean is true - return gets terminated method
        }
        System.out.println((grade=='A')?"Excellent" :(grade=='B')?"Great job" :(grade=='C')?"Good" :(grade=='D')?"Passed" : "Failed");
    }
}
