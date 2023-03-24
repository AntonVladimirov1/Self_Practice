package day07_Finra;

public class FINRA {
    public static void main(String[] args) {
/*
Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
                  // TERNARY style
        int num = 15; // let's pretend it's PIN that should be entered.

        String result = (num%3==0 && num%5==0)?"FINRA" :(num%3==0)?"FIN" :(num%5==0)?"RA"  :"Invalid PIN";
        System.out.println(result);
        // Or we can simplify the code setting additional variables:
        /*
         boolean by3= num%3==0;
         boolean by5= num%5==0;*/

        System.out.println("===========================");

    }
}
