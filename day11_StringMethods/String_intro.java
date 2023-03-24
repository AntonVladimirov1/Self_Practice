package day11_StringMethods;

import java.util.Scanner;
//import java.lang.String;
//import java.lang.System;

public class String_intro {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String str = "Java";
        input.close();
        System.out.println("================================");

        String str1=new String("Java");
        String str2=new String("Java");

        System.out.println(str1==str2);



    }
}
