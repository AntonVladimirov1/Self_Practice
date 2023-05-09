package day37_Exceptions;

public class Exceptions_Intro {
    public static void main(String[] args) {

        String str = "Java";
        char ch = str.charAt(250); // drivel - to call exception
        System.out.println(ch);

    }
}
