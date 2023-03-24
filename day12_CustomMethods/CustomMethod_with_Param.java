package day12_CustomMethods;

public class CustomMethod_with_Param {
    public static void main(String[] args) {

        oddOrEven(6);
        eligible21(20,"Yes");

    }

    // This method takes an argument number and works in the method
    public static  void oddOrEven(int num){

        System.out.println((num==0)? num+" is zero" :(num%2==0)? num+" is even" : num+" is odd");

        System.out.println("===================================");
    }
    public  static  void eligible21(int age,String citizen){

        System.out.println((age>=21 && citizen.equalsIgnoreCase("yes"))?"eligible" : "not eligible");
    }

}
