package day06_practice;

public class IF_Statement {
    public static void main(String[] args) {

        int number= -140;

        boolean isPositive= number >0;
        boolean isNegative= number <0;
        boolean isZero= number ==0;

        if(isPositive){
            System.out.println(number+" is positive number");
        }
        if(isNegative){
            System.out.println(number+" is negative number");
        }
        if(isZero){
            System.out.println(number+" is zero number");
        }
        System.out.println("------------------------------------------------------------");

        int num = 150;

        if(num>0){
            System.out.println(num+" is positive number");
        }
        if(num<0){
            System.out.println(num+" is negative number");
        }
        if(num==0){
            System.out.println(num+" is zero");
        }
    }
}
