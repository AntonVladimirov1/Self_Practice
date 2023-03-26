package Live_Sessions;

import java.util.Scanner;

public class Array_Moth_byNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the moth number 1-12");
        int month = input.nextInt();

        if (month>=1 && month<=12){
            String[] data = {"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

            System.out.println(data[month]);
            //System.out.println(Arrays.toString(data)); // this method used to print whole array
        }else {
            System.out.println("Sorry, invalid moth number");
        }

    }
}
