package day06_practice;

public class MonthName_Practice {
    public static void main(String[] args) {

        int mon= 15;

        if (mon==1){
            System.out.println("Jan");
        } else if (mon==2) {
            System.out.println("Feb");
        } else if (mon==3) {
            System.out.println("Mar");
        } else if (mon==4) {
            System.out.println("Apr");
        } else if (mon==5) {
            System.out.println("May");
        } else if (mon>=6 && mon<=12){
            System.out.println("All other possible months");
        }else {
            System.out.println("You are from different planet");
        }
    }
}
