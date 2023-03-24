package day10_Scanner;

import java.util.Scanner;

public class Shipping_Address {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String name = input.nextLine();
        System.out.println("Enter your building number:");
        String build_num = input.nextLine();
        System.out.println("Enter your Street name:");
        String street = input.nextLine();
        System.out.println("Enter your City name:");
        String city = input.nextLine();
        System.out.println("Enter your State");
        String state = input.nextLine();
        System.out.println("Enter your zip code");
        String zip = input.nextLine();


        System.out.println("Your shipping address is: \n\t"+name+"\n\t"+build_num+" "+street+"\n\t"+city+", "+state+" "+zip);
       // System.out.println("Full name : "+name);
        //System.out.println("Building : "+build_num);
        //System.out.println("Street name: "+street);
        //System.out.println("City: "+city);
        //System.out.println("State: "+state);
        //System.out.println("Zip code: "+zip);
        input.close();
    }

}
