package day08_Switch_Ternary;

public class SWITCH {
    public static void main(String[] args) {

        char grade= 'l';   /*
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
         */
        String result;

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                //inside one case could be any code like: profit= 0, countries= 0, any variable= 0;
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid grade");
                break;

        }

    }
}
