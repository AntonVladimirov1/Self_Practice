package utilities;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        boolean run = true;

        System.out.println("Hello. I am chat bot");

        while(run){
            System.out.println("> ");
            String userInput = input.nextLine().toLowerCase().trim();

           switch (userInput){
               case "hello":
                   System.out.println("world");break;
               case "age":
               case "what is your age":
                   System.out.println("I was programmed in March");break;
               case "who create you":
                   System.out.println("I was created by Saim");break;
               case "what can we talk about":
                   System.out.println("I will respond to these:.............");break;
               case "off":
                   System.out.println("haha you cannot turn me off. I am invincible");break;
               case "shutdown":
                   System.out.println("SHUTTING DOWN");
                   run = false;
                   break;
               default:
                   System.out.println("Sorry I didn't get that");
           }
        }
        input.close();
    }


}
