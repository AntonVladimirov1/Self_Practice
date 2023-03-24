package Live_Sessions;

import java.util.Scanner;

public class Sunday03_05_3 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String name = input.nextLine(); // james bond
        name =name.toLowerCase();
        int spaceIndex =name.indexOf(" "); // 5
        String firstName =name.substring(0, spaceIndex);
        String lastName =name.substring(spaceIndex+1);

        // String upperFirst =name.substring(0,1).toUpperCase();

        firstName =firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        String lastNameChar =lastName.substring(0,1);
        lastNameChar =lastNameChar.toUpperCase();
        lastName =lastNameChar + lastName.substring(1);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstName.substring(0,1) + lastName.substring(0,1));

    }
}
