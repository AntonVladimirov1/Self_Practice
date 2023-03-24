package day12_CustomMethods;

public class CustomMethod_Practice {
    public static void main(String[] args) {

        maxNum(145,5824);
        initial("anton","vladimirov");
    }
    public  static  void maxNum(double num1,double num2){
        if (num1>num2){
            System.out.println(num1+" is max");
        }else if (num2>num1){
            System.out.println(num2+" is max");
        }else{
            System.out.println("numbers are equal");
        }
    }
    public  static void initial(String firstName,String lastName){
        String initials =firstName.toUpperCase().charAt(0)+ "" +lastName.toUpperCase().charAt(0);
        System.out.println("initial is: "+initials);
    }
}
