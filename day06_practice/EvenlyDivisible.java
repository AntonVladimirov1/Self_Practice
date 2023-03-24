package day06_practice;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number= 15;

        boolean div2= number % 2 ==0; //remainder
        boolean div3= number % 3 ==0;
        boolean div5= number % 5 ==0;

        System.out.println("divisible by 2: "+div2);
        System.out.println("divisible by 3: "+div3);
        System.out.println("divisible by 5: "+div5);

    }
}
