package Self_Training;

import java.util.Scanner;

public class Seconds2 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter seconds:");
        int Seconds = input.nextInt();
        int hours = Seconds/3600;
        int minutes = (Seconds%3600)/60;
        int seconds = (Seconds%60)/1;

        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
        System.out.println("===================================");

        System.out.println("Enter hours:");

        int hours1 =input.nextInt();
        System.out.println(hours1*3600+ " seconds");

        input.close();

    }
}
