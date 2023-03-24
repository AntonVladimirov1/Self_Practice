package day19_Array;

import utilities.ArraysMerge;

import java.util.Arrays;

public class MergeTwoArrays_ {
    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = new int[arr1.length + arr2.length]; // to be sure of exact numbers of elements

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("======================================");

        int[] a1 = {10,20,30,40,50,60,};
        int[] a2 = {70,80,90,};

        int[] a3 = ArraysMerge.merge(a1,a2);

        System.out.println(Arrays.toString(a3));
        System.out.println("======================================");

        double[] b1 = {10.5,5.5,3.5,6.5,8.5};
        double[] b2 = {20.5,15.5,13.5};

        double[] b3 = ArraysMerge.merge(b1,b2);
        System.out.println(Arrays.toString(b3));
        System.out.println("=======================================");

        char[] ch1 = {'A','b','c','D','e'};
        char[] ch2 = {'X','Y','Z'};

        char[] ch3 = ArraysMerge.merge(ch1,ch2);
        System.out.println(Arrays.toString(ch3));
        System.out.println("=======================================");

        String[] str1 = {"kuku","pupu","coco"};
        String[] str2 = {"kaka","popa"};

        String[] str3 = ArraysMerge.merge(str1,str2);
        System.out.println(Arrays.toString(str3));


        }
    }

