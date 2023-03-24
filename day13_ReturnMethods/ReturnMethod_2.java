package day13_ReturnMethods;

public class ReturnMethod_2 {
    public static void main(String[] args) {

        System.out.println(isOdd(3));
        System.out.println(isEven(4));
        System.out.println("Max number - "+maxNum(100,200));
        System.out.println("Min number - "+minNum(10,20));

    }

    public static boolean isOdd(int num){
        boolean result =(num%2!=0);
        return result;
    }
    public static boolean isEven(int num){
        boolean result =(!isOdd(num));
        return result;
    }
    public static int maxNum(int num1,int num2){
         int result =(num1>num2)? num1 : num2;
        return result;
    }
    public static int minNum(int n1,int n2){
        int result =(n1<n2)? n1 : n2;
        return result;
    }
}
