package utilities;

import java.util.Arrays;

public class AddElementToArray {

    public static int[] addElement(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static double[] addElement(double[] array, double element) {
        double[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static char[] addElement(char[] array, char element) {
        char[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static String[] addElement(String[] array, String element) {
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }
}
