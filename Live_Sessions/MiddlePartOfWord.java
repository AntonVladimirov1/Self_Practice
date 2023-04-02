package Live_Sessions;

import java.util.Scanner;

public class MiddlePartOfWord {
    public static void main(String[] args) {
        // to determine first and last char

        Scanner input =new Scanner(System.in);
        //String word ="java"; - hard coded
        System.out.println("Enter your word:");
          String word = input.next();
          char first = word.charAt(0);
          char last = word.charAt(word.length()-1);
          String middle =word.substring(1, word.length() - 1);

          if (first==last) { // we use == because we are comparing char types
              System.out.println(middle);
          }else{
              System.out.println("*"+middle+"#");
          }
          input.close();
    }
}
