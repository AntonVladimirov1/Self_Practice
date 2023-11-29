package day08_Switch_Ternary;

public class TERNARY_multi_branch {
    public static void main(String[] args) {

        int number= 100;

        String result= (number>0) ? "Positive" :(number<0) ? "Negative" : "Zero";
        System.out.println(result);

        System.out.println("======================================");

        int n= 1;
        String day = (n==1) ?"Monday" :(n==2)?"Tuesday" :(n==3)?"Wednesday" :(n==4)?"Thursday" :(n==5)?"Friday" :(n==6)?"Saturday" : "Sunday";
        System.out.println(day);

        System.out.println("======================================");

        int num= 4;
        String month = (num==1)?"Jan" :(num==2)?"Feb" :(num==3)?"Mar" :(num==4)?"Apr" :(num==5)?"May" :(num==6)?"Jun" :(num==7)?"Jul" :(num==8)?"Aug" :(num==9)?"Sep" :(num==10)?"Oct" :(num==11)?"Nov" :"Dec";
        System.out.println(month);
    }
}
