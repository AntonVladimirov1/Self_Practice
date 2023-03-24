package day08_Switch_Ternary;

public class TERNARY_Nested {
    public static void main(String[] args) {

/*int score = 200;
        String result= "";

        if (score >= 0 && score <= 100) { //"pre condition"- can write first and then insert IF/ELSE body inside of it

            if (score >= 60)
                result = "Passed";
            else
                result = "Failed";

        }else {
            result = "Invalid score";
        }
        System.out.println(result);*/
        int score= 55;

        String result= (score>= 0 && score<=100)?
                (score>= 60)?"Passed" :(score<= 50)?"Failed" :"Govno"
                :"Invalid score";
        System.out.println(result);

        System.out.println("========================================");
        int n=5;

        String day= (n>=1 && n<= 7)?
                (n==1)?"Monday" :(n==1)?"Tuesday" :(n==3)?"Wednesday" :(n==4)?"Thursday" :(n==5)?"Friday" :(n==6)?"Saturday" :"Sunday"
                :"No such day";
        System.out.println(day);

    }
}
