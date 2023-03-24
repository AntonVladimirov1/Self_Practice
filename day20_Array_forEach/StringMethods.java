package day20_Array_forEach;

import utilities.ArraysReverse;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" ","").toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println("===============================================");

        String str2 = "Today is a great day to learn Java";
        String[] words = str2.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("===============================================");

        String sentence = "Today is a great day to learn Java";
        String[] arr = ArraysReverse.reverse(sentence.split(" "));
        System.out.println(Arrays.toString(arr));

        String reversedSentence = "";
        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] +" ";
        }
        System.out.println(reversedSentence);


    }
}
