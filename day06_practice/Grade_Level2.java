package day06_practice;

public class Grade_Level2 {
    public static void main(String[] args) {

        int gradeLevel= 13;

        String result = "";  // temporary value

        if(gradeLevel >=1 && gradeLevel<= 5){
           result = "Elementary";
        }
        if(gradeLevel>=6 && gradeLevel<=8){
            result = "Middle";
        }
        if(gradeLevel>=9 && gradeLevel<=12){
            result = "High";
        }
        if(gradeLevel>=13 && gradeLevel<=16){
            result = "College";
        }
        System.out.println(result);

    }
}
