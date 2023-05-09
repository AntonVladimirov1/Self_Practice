package day37_Exceptions;

public class Try_Catch_blocks {
    public static void main(String[] args) {


        System.out.println("1 started");

        try {
            System.out.println(9 / 0);
            System.out.println("Try block");
        }catch (ArithmeticException e){
            System.out.println("Catch block");
        }
        System.out.println("1 ended");

        System.out.println("2 started");

        String str = null;
        try {
            System.out.println(str.toUpperCase());
            System.out.println("try block");
        }catch (RuntimeException e){
            System.out.println("catch block");
        }
        System.out.println("2 ended");

    }
}
