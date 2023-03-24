package day06_practice;

public class Grade_Level_Practice {
    public static void main(String[] args) {

        int gl = 60;
        String result="";

        if (gl>=1 && gl<=5){
            result="Elementary";
        } else if (gl>=6 && gl<=8) {
            result="Middle";
        } else if (gl>=9 && gl<=12) {
            result="High";
        } else if (gl>=13 && gl<=16) {
            result="College";
        }else if(gl>=17 && gl<=55){
            result="Graduated";
        }else {
            result="OLDY";
        }
        System.out.println(result);
    }
}
