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
    public static double[] removeDup(double[] arr){
        Arrays.sort(arr);

        double count =1;
        for (double i = 1; i < arr.length; i++) {
            if (arr[(char) i] !=arr[(char) (i-1)]){
                count++;
            }
        }
        double[] result = new double[(char) count];
        result[0] = arr[0];
        double j =1;
        for (double i = 1; i < arr.length; i++) {
            if (arr[(char) i] != arr[(char) (i-1)]){
                result[(char) j] = arr[(char) i];
                j++;
            }
        }
        return result;
    }
    public static char[] removeDup(char[] arr){
        Arrays.sort(arr);

        char count =1;
        for (char i = 1; i < arr.length; i++) {
            if (arr[i] !=arr[i-1]){
                count++;
            }
        }
        char[] result = new char[count];
        result[0] = arr[0];
        char j =1;
        for (char i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]){
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] something ={'a','a','a','b','b','c'};
        System.out.println(removeDup(something));
    }

}
