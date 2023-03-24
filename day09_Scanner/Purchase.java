package day09_Scanner;

import java.util.Scanner;

public class Purchase {
    public static void main(String[] args) {

        Scanner input =new Scanner(System. in);

        System.out.println("Hello, which item would you like?");
        String item =input.nextLine();

        int price =241255436;
        boolean isValid =true;

        switch(item){
            case "Blanket": price =60;
                break;
            case "Charger": price =5;
                break;
            case "Hat": price =25;
                break;
            case "Headphones": price =30;
                break;
            case "Laptop": price =200;
                break;
            case "Pants": price =50;
                break;
            case "Pillow": price =40;
                break;
            case "Smartphone": price =1000;
                break;
            case "Socks": price =5;
                break;
            case "USB cable": price =10;
                break;
            default:isValid =false;
                System.out.println("Sorry, that is an invalid item");

        }

        if(price<=100 && isValid ){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(100-price)+"$");
        }else if (isValid){
            System.out.println("Sorry, not enough funds on your gift card");
        }


    }

    }

