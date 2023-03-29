package day19_Array;

import utilities.ArraysReverse;

import java.util.Arrays;

public class Array_Reverse {
    public static void main(String[] args) {


        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            reverse[j] = array[i];
            //  Or like this:
            // int j =0; or you can declare 'v' here
            //  for (int i = array.length - 1 ; i >= 0; i--) {
            //            reverse[j++] = array[i];
        }
        System.out.println(Arrays.toString(reverse));
        System.out.println("====================================================");

        int[] nums = {10,20,30,40,50,60,70,80,90,100};
        nums = ArraysReverse.reverse(nums); // calling stored method
        System.out.println(Arrays.toString(nums));

    }
}
