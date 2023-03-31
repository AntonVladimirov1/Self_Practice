package utilities;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int[] letter ={1,2,3,4,5,6};
        int[] number = RemoveElement_FromArray.remove(letter,5);
        System.out.println(Arrays.toString(number));

    }
}

