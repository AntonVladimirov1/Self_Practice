package utilities;

public class RemoveElement_FromArray3 {
    public static int[] remove(int[] array, int index) {
        int[] result = new int[array.length - 1];
        for (int i = 0, num = 0; i < array.length; i++, num++) {
            if (i == (index)) {
                --num;
                continue;
            }
            result[num] = array[i];
        }
        return result;
    }
}
