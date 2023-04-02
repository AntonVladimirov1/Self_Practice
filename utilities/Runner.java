package utilities;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next();
        word.toLowerCase();

        System.out.println(word.substring(2,word.length()-2));

    }
}

