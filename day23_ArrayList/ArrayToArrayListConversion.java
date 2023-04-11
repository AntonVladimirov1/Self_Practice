package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListConversion {
    public static void main(String[] args) {
                     /// ArrayList to Array
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        Integer[] n = nums.toArray(nums.toArray(new Integer[0]));

        System.out.println(Arrays.toString(n));

                      /// Array to ArrayList
        String[] arr = {"h","u","j","l","o"};

        ArrayList<String> list =new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);
        System.out.println("===========================================");






    }
}
