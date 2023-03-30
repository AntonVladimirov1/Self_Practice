package utilities;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8};

        int[] num = RemoveElement_FromArray.remove(numbers,3);
        System.out.println(Arrays.toString(num));

    }
}

