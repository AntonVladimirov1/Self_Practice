package day09_Scanner;

import java.util.Scanner;

public class Scanner_Middle_number {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1= input.nextInt();

        System.out.println("Enter second number:");
        int num2= input.nextInt();

        System.out.println("Enter third number:");
        int num3= input.nextInt();

        if ((num1>num2 && num1<num3)||(num1>num3 && num1<num2)){
            System.out.println("middle number is: "+num1);
        } else if ((num2>num1 && num2<num3)||(num2>num3 && num2<num1)){
            System.out.println("middle number is: "+num2);
        } else{
            System.out.println("middle number is: "+num3);
        }

        input.close(); // scanner is closed and can not read inputs again

        System.out.println("================================================");
                     // to find the Biggest Number !!!
        int x= 150;
        int y= 160;
        int z= 170;

        int largestNumber = (x>y)? (x>z ? x : z) : (y>z ? y : z);
        System.out.println(largestNumber);

    }
}
