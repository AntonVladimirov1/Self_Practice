package utilities;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,2,5,6,7,8,8,3,7};

        int[] newArr = RemoveDuplicates_FromArray.removeDup(numbers);
        System.out.println(Arrays.toString(newArr));

    }
}

