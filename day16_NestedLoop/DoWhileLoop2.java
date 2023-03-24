package day16_NestedLoop;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        String  u,p;
        //int attempt = 3; // if you want to set attempt count
        do{
            System.out.println("Enter your user name:");
            u = input.next();
            System.out.println("Enter your password:");
            p = input.next();

           /*  attempt--;  // this block use with attempt variable only!!!
               if(attempt==0){
               break;
            }  */

        }while (!(u.equals("User") && p.equals("Pass")));

    }
}
