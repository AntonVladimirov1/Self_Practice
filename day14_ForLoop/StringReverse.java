package day14_ForLoop;

public class StringReverse {
    public static void main(String[] args) {

        String str ="Java Cydeo"; // "avaJ"
        String reverse ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("==========================");

        String name = "Anto Vladimirov";

        System.out.println(reverse(name));

    }

    public static String reverse(String str){
        String reverse ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }
}
