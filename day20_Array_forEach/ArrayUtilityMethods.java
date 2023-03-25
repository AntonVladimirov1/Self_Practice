package day20_Array_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        int[] score = {70,100,80,90,65};
        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);
        System.out.println(result);
        System.out.println("===============================");

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};
        boolean r1 = Arrays.equals(a1,a2);  //equals
        System.out.println(r1);
        System.out.println("===============================");

        char[] ch1 = {'A','B','C'};
        char[] ch2 = {'A','C','B'};
        boolean r2 = Arrays.equals(ch1,ch2);
        System.out.println(r2);
        System.out.println("===============================");

        int[] nums = {1,7,9,4,6,2,3,0};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);                               // sort
        System.out.println(Arrays.toString(nums));
        System.out.println("Max number: "+ nums[0]);
        System.out.println("Min number: "+ nums[nums.length-1]);
        System.out.println("================================");

        String[] b1 = {"A","B","C"};
        String[] b2 = {"A","C","B"};
        Arrays.sort(b1);
        Arrays.sort(b2);
        System.out.println(Arrays.equals(b1,b2));
        System.out.println("================================");

        String[] v1 = {"Abba","Celka","Booba"};
        Arrays.sort(v1);
        System.out.println(Arrays.toString(v1));




    }
}
