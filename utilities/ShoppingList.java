package utilities;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String add = "";
        String list = "";
        do {
            System.out.println("What item do you want to add to the list?");
            // String item = input.nextLine(); // this
            // list += item;
            list += "\n\t *" + input.nextLine(); // or this

            System.out.println("Do you want to add more items?");
            add = input.nextLine();

            while ((!add.equalsIgnoreCase("yes")) && (!add.equalsIgnoreCase("no"))) {
                System.out.println("Sorry, do you want to add something, yes or no");
                add = input.nextLine();
            }
        } while (add.equalsIgnoreCase("yes"));

        System.err.println("Your list:\t"+list);
    }
}