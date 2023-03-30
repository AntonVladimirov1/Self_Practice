package day22_ArrayList_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20"; // need to convert to int
        System.out.println(str +1);
        System.out.println("=======================");

                                      // parse Method
        // Integer num1 = Integer.parseInt(str); // unboxing
        int num = Integer.parseInt(str);
        System.out.println(num +1);
        System.out.println("=======================");

                                     // valueOf Method
        Integer num2 = Integer.valueOf(str);
        System.out.println(num2);
        System.out.println("=======================");

        String s = "20.5";
        double num3 = Double.parseDouble(s);
        Double num4 = Double.valueOf(s);
        System.out.println(num3);
        System.out.println(num4);


    }
}
