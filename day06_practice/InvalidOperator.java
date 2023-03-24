package day06_practice;

public class InvalidOperator {
    public static void main(String[] args) {

        char operator = '-';
        double n1 = 5;
        double n2 = 10;
        double result= 0;

        if(operator=='+'){
            result = n1+n2;
        } else if (operator=='-') {
            result = n1-n2;
        } else if (operator=='*') {
            result = n1*n2;
        } else if(operator=='/'){
            result = n1/n2;
        } else {
            System.out.println("invalid operator");
        }
        System.out.println(result);

    }
}
