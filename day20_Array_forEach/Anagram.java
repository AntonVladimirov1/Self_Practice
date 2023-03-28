package day20_Array_forEach;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

        String[] word1 = str1.split("");
        String[] word2 = str2.split("");
        System.out.println(Arrays.toString(word1));
        System.out.println(Arrays.toString(word2));

        Arrays.sort(word1);
        Arrays.sort(word2);
        System.out.println(Arrays.toString(word1));
        System.out.println(Arrays.toString(word2));

        boolean isAnagram = Arrays.equals(word1,word2);
        System.out.println("isAnagram = "+isAnagram);


    }
}
