package day06_practice;

public class WeekDays_Practice {
    public static void main(String[] args) {

        int num=9;

        String res= "";

        if (num==1){
            res="Monday";
        } else if (num==2) {
            res="Tuesday";
        } else if (num==3) {
            res="Wednesday";
        } else if (num==4) {
            res="Thursday";
        } else if (num==5) {
            res="Friday";
        } else if (num==6) {
            res="Saturday";
        } else if (num==7){
            res="Sunday";
        }else {
            res="You are from different planet";
        }
        System.out.println(res);
    }
}
