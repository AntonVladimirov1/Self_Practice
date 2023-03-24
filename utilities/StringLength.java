package utilities;

import java.util.Scanner;

public class StringLength {
    public static String longestString(){
        Scanner input =new Scanner(System.in);

        String result ="";
        System.out.println("Enter your first string: ");
        String first =input.nextLine();

        System.out.println("Enter your second string: ");
        String second =input.nextLine();

        input.close();

        if (first.length() > second.length()) {
            result="First is longest";
        } else if (first.length() < second.length()) {
            result="Second is longest";
        }else {
            result="Equal";
        }
        System.out.println(result);
            return result;
    }
    }

