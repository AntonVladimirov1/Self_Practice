package day21_Array_MultiDimensional;

import java.util.Arrays;

public class MultiDimensionalArray_Loop {
    public static void main(String[] args) {

        int[][] arr2D = {{10,20,30},{40,50,60,70,80},{90,100},{1000,2000}};

        for (int i =0; i<arr2D.length; i++){
            int[] each1D = arr2D[i];
            System.out.println(Arrays.toString(each1D));

            for (int j=0; j<each1D.length; j++ ){
                 int eachElement = each1D[j];
                System.out.println(eachElement);
            }

        }

    }
}
