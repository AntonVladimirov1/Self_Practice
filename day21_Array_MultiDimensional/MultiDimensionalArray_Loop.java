package day21_Array_MultiDimensional;

import java.util.Arrays;

public class MultiDimensionalArray_Loop {
    public static void main(String[] args) {

        int[][] arr2D = {{10,20,30},{40,50,60,70,80},{90,100},{1000,2000}};

        // regular fori nested loop to print all elements
        for (int i =0; i<arr2D.length; i++){
            int[] each1D = arr2D[i];
            System.out.println(Arrays.toString(each1D));

            for (int j=0; j<each1D.length; j++ ){
                 int eachElement = each1D[j];
                System.out.println(eachElement);
            }
        }
        System.out.println("=====================================");
             // forEach nested loop to print all elements
        for(int[] each1DArray : arr2D){
            System.out.println(Arrays.toString(each1DArray));
            for(int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }
        System.out.println("======================================");

        // shortcut nested loop to show all elements (reverse, can be changed to normal)
        for (int i = arr2D.length - 1; i >= 0; i--) {  // arr2D.forr
            for (int j = arr2D[i].length - 1; j >= 0; j--) {  // arr2D[i].forr
                System.out.println(arr2D[i][j]);
            }
        }
        System.out.println("======================================");

        // shortcut nested forEach loop
        for (int[] each1DArray : arr2D) {  // arr2D.for
            for (int eachElement : each1DArray) {  // each1DArray.for
                System.out.println(eachElement);
            }
        }

        }

    }

