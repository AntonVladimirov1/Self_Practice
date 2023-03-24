package day13_ReturnMethods;

public class ReturnMethod {
    public static void main(String[] args) {

        //sum(20,40);

        int total = addition(20,40); // also we can assign this method as variable
        System.out.println("Result = "+total);
        System.out.println("=====================");
        System.out.println("Square is: "+square(3.5));
        System.out.println("=====================");
        System.out.println("Cube is: "+cube(3.3));

    }

    /*public static void sum(int n1, int n2){
        int result =n1+n2;
        System.out.println(result);
    }*/

    public static int addition(int n1,int n2){
        // "return n1+n2" or vvvvvv
        int result =n1+n2;
        return result;
    }
    public static double square(double num){
        double square =num*num;
        return square;
    }
    public static double cube(double num){
        double cube =square(num)*num;
        return cube;
    }


}
