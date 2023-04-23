package utilities;

import java.util.Arrays;

public class Array_moveFirstIndexToLastPosition {
    public static void main(String[] args) {

        int[] a = {150,2,3};
        // index        0 1 2

        int temp = a[0];
        //value  1

        for (int i = 0; i < a.length-1; i++) {
            a[i] = a[i+1];
            //1      2
            //2      3
            // int[] a = {2,3,3};
        }
        a[a.length-1]= temp;
        //  // int[] a = {2,3,1};
        System.out.println(Arrays.toString(a));

    }
}
