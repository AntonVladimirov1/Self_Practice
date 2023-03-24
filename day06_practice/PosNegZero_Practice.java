package day06_practice;

public class PosNegZero_Practice {
    public static void main(String[] args) {

        int num= 1;
        String result;

        if(num>0){
            result="number is positive";
        } else if (num<0) {
            result="number is negative";
        }else {
            result="Zero";
        }
        System.out.println(result);
    }
}
