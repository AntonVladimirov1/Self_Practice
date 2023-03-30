package utilities;

public class RemoveElement_FromArray {

    public static int[] remove(int[] array, int index){
        int[] res = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {

            if (index != i) {
                res[j++] = array[i];
            } else {

            }
        }
        return res;
    }


}
