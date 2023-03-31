package utilities;

import java.util.Arrays;

public class RemoveElement_FromArray2 {
    public static int[] remove(int[] array, int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array = Arrays.copyOf(array, array.length - 1);
        return array;
    }
}
