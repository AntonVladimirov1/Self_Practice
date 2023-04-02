package Live_Sessions;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Hello, please enter your cents:");
        int cents =input.nextInt(); // 245


        if(cents>0 && cents<=1200) {
            int dollars, quarters, nickles, dimes;
            String msg = "";

            dollars = cents / 100; // 245/100=2
            cents %= 100; // 245%100=45

            //msg += dollars>0? dollars +" dollars" : (""); // optional

            quarters = cents / 25; // 45/25=1
            cents %= 25; // 45%25=1
            dimes = cents / 10; // 20/10=2
            cents %= 10;
            nickles = cents / 5; // leftover/5=...
            cents %= 5;

            msg =dollars + " dollars\n" + quarters + " quarters\n" + dimes + " dimes\n" + nickles + " nickles\n" + cents + " pennies";
            System.out.println(msg);
        }else{
            System.out.println("Sorry we can not process your request");
        }
        input.close();

    }
}
