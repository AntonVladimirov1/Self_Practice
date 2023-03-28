package day21_Array_MultiDimensional;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};
        int[] arr4 = {1000,2000};

        int[][] arr2D = {{10,20,30},{40,50,60,70,80},arr3,arr4};
        System.out.println(arr2D.length);

        System.out.println(arr2D[1][2]); // to return single element of the specific single array

    }
}
