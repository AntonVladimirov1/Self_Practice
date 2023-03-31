package utilities;

import java.util.Arrays;

public class RemoveDuplicates_FromArray {

     public static int[] removeDup(int[] arr){
         Arrays.sort(arr);

         int count =1;
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] !=arr[i-1]){
                 count++;
             }
         }
         int[] result = new int[count];
         result[0] = arr[0];
         int j =1;
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] != arr[i-1]){
                 result[j] = arr[i];
                 j++;
             }
         }
         return result;
     }
}
