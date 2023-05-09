package day37_Exceptions;

import day37_Exceptions.Override_equals_method.Pizza;

public class Exceptions_Intro {
    public static void main(String[] args) {

        String str = "Java";
       // char ch = str.charAt(250); // drivel - to call exception
       // System.out.println(ch);   // unchecked exception


            Pizza pizza = null;  // unchecked exception
            pizza.calcCost();

       // System.out.println(50/0);  // unchecked exception

        int score = 100;
        if (score >59){
            System.out.println("jhgjhgjh11");
        } else if (score > 70) {
            System.out.println("jhgjhgjh22");
        }
        System.out.println("========================================");

       // FileInputStream file = new FileInputStream(); // when compiler - it is checked exception

        //Thread.sleep(3000,0); // checked exception


    }
}
