package day21_Array_MultiDimensional;

public class MaxMinNum_multDimArray {
    public static void main(String[] args) {

        int[][] array = {{100,20,30},{45,7000,65,},{-150,67,0}};

        int max = array[0][0];
        int min = array[0][0];

        for (int[] each1D : array) {
            for (int eachElement : each1D) {

                if (eachElement > max){
                    max = eachElement;
                }
                if (eachElement < min){
                    min = eachElement;
                }
            }
        }
        System.out.println("Max num = "+max);
        System.out.println("Min num = "+min);
    }
}

