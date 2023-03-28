package day20_Array_forEach;

import java.util.Arrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {

        String str = " Hello world     I    love     Java";


        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        str ="";

        for(String each : words){
            if (!each.isEmpty()){
                str += each+" ";
            }
        }
        str = str.trim();
        System.out.println(str);

    }
}
