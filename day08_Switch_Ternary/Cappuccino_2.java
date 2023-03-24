package day08_Switch_Ternary;

public class Cappuccino_2 {
    public static void main(String[]args){

        String size= "tall";
        String result= "Invalid size";

        if (size=="tall" || size=="grande" || size== "venti"){

            result= "Price is ";

            if (size=="tall") result += "$3.69\n90 calories";
            if (size=="grande") result += "$3.99\n120 calories";
            if (size=="venti") result += "$4.29\n150 calories";
        }else{
        }
        System.out.println("==================");
        System.out.println(result);
        System.out.println("==================");

    }
}
