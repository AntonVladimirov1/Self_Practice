package day08_Switch_Ternary;

public class TERNARY_Nested_mix {
    public static void main(String[] args) {

        int score=120;
        String result= "";

        if (score>=0 && score<=100){

            result = (score>= 90)?"A" :(score>=80)?"B" :(score>=70)?"C" :(score>=60)?"D" :"F";
        }else{
            result= "Invalid score";
        }
        System.out.println(result);

    }
}
