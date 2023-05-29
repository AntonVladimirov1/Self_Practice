package utilities;

public class Runner2 {
   /* private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }*/

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("eL ihT");
        str.reverse();
        System.out.println(str);
        System.out.println("============================");
        System.out.println( (int) '2');
        System.out.println("============================");
        int a = 5;
        int b = 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("===========");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
