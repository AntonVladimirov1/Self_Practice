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


}
