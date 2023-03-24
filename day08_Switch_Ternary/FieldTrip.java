package day08_Switch_Ternary;

public class FieldTrip {
    public static void main(String[] args) {

        int grade= 6;
        String location= "";
        int groupNum= 0;
        String teacher="";

        if (grade>= 1 && grade<= 6){

            if (grade== 1) {
                location = "Apple Orchard";
                groupNum = 3;
                teacher = "Ms. Smith";
            }else if (grade== 2) {
                location = "Zoo";
                groupNum = 7;
                teacher = "Ms. Lee";
            }else if (grade== 3) {
                location = "Aquarium";
                groupNum = 5;
                teacher = "Ms. Wilson";
            }else if (grade== 4) {
                location = "Movie";
                groupNum = 2;
                teacher = "Ms. Bob";
            }else if (grade== 5) {
                location = "Museum";
                groupNum = 6;
                teacher = "Ms. Lela";
            }else{
                location = "Swimming Pool";
                groupNum = 1;
                teacher = "Ms. Lolita";
            }

        }
        System.out.println(location+ "\n" +groupNum+ "\n" +teacher);


    }
}
