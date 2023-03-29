package day21_Array_MultiDimensional;

import java.util.Arrays;

public class _1DimensArray_vs_2DimensArray {
    public static void main(String[] args) {

        int[] arr1D = new int[10];
        arr1D[0]=100; // can reassign any element
        System.out.println(Arrays.toString(arr1D));

        int[]arr1 = {1,2,3,4,5,6,7};
        int[]arr2 = {1,2,3,4,5};
        int[]arr3 = {1,2,3,4,5};
        int[]arr4 = {1,2,3,4,5};
        int[]arr5 = {1,2,3,4,5};
        int[]arr6 = {1,2,3,4,5};

        int[][] arr2D = new int[6][]; // assigning index of
        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;
        arr2D[5] = arr6;
        System.out.println(Arrays.deepToString(arr2D));

    }
}
