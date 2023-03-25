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
        System.out.println("===============================================");

        int[] array = {10,20,30,40,50,60,70};
        int[] array2 = Arrays.copyOf(array,10); // copying given array to the new one and declare the length of new one
        System.out.println(Arrays.toString(array2));
        System.out.println("===============================================");

        int[] n1 = {1,2,3,4,5};              // another way to merge arrays
        int[] n2 = {6,7,8,9,10,11,12};
        int[] n3 = Arrays.copyOf(n1,n1.length + n2.length);
        for (int i = 0, j=n1.length; i < n2.length; i++,j++) {
            n3[j] = n2[i];
        }
        System.out.println(Arrays.toString(n3));
        System.out.println("===============================================");

        char[] ch1 = {'A','B','C','D','E','F','G'};
        char[] result1 = Arrays.copyOfRange(ch1,1,4);
        System.out.println(Arrays.toString(result1));

    }
}
