package day09_Scanner;

import java.util.Scanner;

public class Print_Variable_5 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();

        if(a>b){
            System.out.println(a + " is greater");
        }else{
            System.out.println(b + " is greater");
        }

    }
}
