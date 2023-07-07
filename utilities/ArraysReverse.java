package utilities;

import java.util.Arrays;

public class ArraysReverse {

    public static int[] reverse(int[] array) {

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j =0; i >= 0; i--, j++) {
            reverse[j] = array[i];
            //  Or like this:
            // int j =0; or you can declare 'v' here
            //  for (int i = array.length - 1 ; i >= 0; i--) {
            //            reverse[j++] = array[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] array) {

        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j =0; i >= 0; i--, j++) {
            reverse[j] = array[i];
            //  Or like this:
            // double j =0; or you can declare 'v' here
            //  for (double i = array.length - 1 ; i >= 0; i--) {
            //            reverse[j++] = array[i];
        }
        return reverse;
    }

    public static char[] reverse(char[] array) {

        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j =0; i >= 0; i--, j++) {
            reverse[j] = array[i];
            //  Or like this:
            // int j =0; or you can declare 'v' here
            //  for (int i = array.length - 1 ; i >= 0; i--) {
            //            reverse[j++] = array[i];
        }
        return reverse;
    }

    public static String[] reverse(String[] array) {

        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j =0; i >= 0; i--, j++) {
            reverse[j] = array[i];
            //  Or like this:
            // int j =0; or you can declare 'v' here
            //  for (int i = array.length - 1 ; i >= 0; i--) {
            //            reverse[j++] = array[i];
        }
        return reverse;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverse(num)));
        String[] letters = {"good","are","you"};
        System.out.println(Arrays.toString(reverse(letters)));
    }
}
