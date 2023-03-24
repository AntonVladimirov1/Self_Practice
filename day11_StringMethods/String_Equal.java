package day11_StringMethods;

import java.util.Scanner;

public class String_Equal {
    public static void main(String[] args) {

        // to compare two strings
        String name1="Umran";
        String name2= new String("Umran");
        System.out.println(name1.equals(name2));

        String r1= "Java";
        String r2= "Java";
        String r3= "java";
        System.out.println(r1.equals(r3)); //equal to compare values

        System.out.println("==================================");

        Scanner input=new Scanner(System.in);

        System.out.println("How old are you?");
        int age= input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer= input.next();

        if (age>= 21 && answer.equalsIgnoreCase("yes")){ // to compare with IgnoreCase
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }

    }
}
