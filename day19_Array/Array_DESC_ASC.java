package day19_Array;

import java.util.Arrays;

public class Array_DESC_ASC {
    public static void main(String[] args) {

        int[] arr1 = new int[100];
/*
        for (int i = 0, j=1; i < arr1.length; i++, j++) { //can be done this way
            arr1[i] = j;
        }*/
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1 + i;
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));

        System.out.println("========================================================");

        int[] arr2 = new int[100];

        for (int i = 0; i < arr2.length; i++) { // reverse
             arr2[i] = 100 - i;
        }
        System.out.println("arr2 = " +Arrays.toString(arr2) );

    }
}
