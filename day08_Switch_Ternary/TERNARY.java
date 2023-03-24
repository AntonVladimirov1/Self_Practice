package day08_Switch_Ternary;

public class TERNARY {
    public static void main(String[] args) {


        int score=70;
        String result;

        if (score>=60){
            result= "Passed";
        }else {
            result= "Failed";
        }
        System.out.println(result);

        System.out.println("=======================================");

        String result2 = (score>= 60 && score<= 70) ? "Passed" : "Failed";
        System.out.println(result2);

        System.out.println("=======================================");

        int age= 24;
        /*
        String r;

        if (age>=21){
            r="Eligible";
        }else {
            r="Not eligible";
        }
*/
        String result3= (age>=21)? "Eligible" : "Not eligible";
        System.out.println(result3);
    }
}
