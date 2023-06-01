package utilities;

public class Runner2 {

    public static void SwapNumbers(int a,int b){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("--------");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void DivisibleBy(){
        String by15 = "";
        String by3 = "";
        String by5 = "";
        for (int i = 1; i <= 100 ; i++) {
            if (i%15==0){
                by15 += i+"; ";
            } else if (i%3==0) {
                by3 += i+"; ";
            } else if (i%5==0) {
                by5 += i+"; ";
            }
        }
        System.out.println("Divisible by 15:  "+by15);
        System.out.println("Divisible by 5:  "+by5);
        System.out.println("Divisible by 3:  "+by3);
    }
    public static void Codility(int N) {
        for (int i = 1; i <= N; i++) {
            StringBuilder result = new StringBuilder();
            if (i % 2 == 0) {
                result.append("Codility");
            }
            if (i % 3 == 0) {
                result.append("Test");
            }
            if (i % 5 == 0) {
                result.append("Coders");
            }
            if (result.length() == 0) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }

    public static void main(String[] args) {

        SwapNumbers(5,10);
        System.out.println("=======================");
        DivisibleBy();
        System.out.println("=======================");
        Codility(30);
        System.out.println("=======================");

        StringBuilder result = new StringBuilder("welcome");
        System.out.println(result.reverse());  //* very cool thing!!!
    }

}
