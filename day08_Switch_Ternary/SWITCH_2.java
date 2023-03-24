package day08_Switch_Ternary;

public class SWITCH_2 {
    public static void main(String[] args) {

        int n= 8;
        String day= "";

        switch (n){
            case 1: day= "Monday";break;
            case 2: day= "Tueday";break;
            case 3: day= "Wednesday";break;
            case 4: day= "Thursday";break;
            case 5: day= "Friday";break;
            case 6: day= "Saturday";break;
            case 7: day= "Sunday";break;
            default: day= "Invalid day";

        }
        System.out.println(day);

    }
}
