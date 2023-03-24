package day06_practice;

public class NumberOfDays {
    public static void main(String[] args) {


        int n = 10;

        boolean has28 = n==2;
        boolean has30 = n==4 || n==6 || n==9 || n==11;
        boolean has31 = !has30 && !has28;

        String result = "";

        if(has28){
            result = "28 days";}
        if(has30){
            result = "30 days";}
        if(has31){
            result = "31 days";}

        System.out.println(result);

    }
}
