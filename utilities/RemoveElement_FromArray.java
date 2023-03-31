package utilities;

public class RemoveElement_FromArray {

    public static int[] remove(int[] array, int index) {
        int[] newArr = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++,j++) {
            if (index != i) {
                newArr[j] = array[i];
            }
        }
        return newArr;

    }
    public static double[] remove(double[] array, double index) {
        double[] newArr = new double[array.length - 1];
        for (double i = 0, j = 0; i < array.length; i++,j++) {
            if (index != i) {
                newArr[(int) j] = array[(int) i];
            }
        }
        return newArr;

    }
    public static char[] remove(char[] array, char index) {
        char[] newArr = new char[array.length - 1];
        for (char i = 0, j = 0; i < array.length; i++,j++) {
            if (index != i) {
                newArr[j] = array[i];
            }
        }
        return newArr;

    }

}
