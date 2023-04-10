package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Runner2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(8,13,13,13,1,2,12,3,4,13,5,11,6,7,8,9,10,12,12));

        int n = 3;
        /*The for-loop iterates from 1 to n-1, i.e., 1 to 3 in this case,
        because we are trying to remove the largest elements from the ArrayList
         in order to find the 4th largest.
         */
        for (int i = 1; i < n; i++) {
            /*
            Within the for-loop, we use the Collections.max() method to find the largest element in the ArrayList.
            We then create a new ArrayList using Arrays.asList() that contains only this largest element
            and use the removeAll() method to remove all occurrences
            of this largest element from the original ArrayList list.
            in the first iteration max is 8 and we remove all 8s
            in the next iteration max is 7 and we remove all 7s and so on...
             */
            list.removeAll(Arrays.asList(Collections.max(list)));
        }
        /*
        After the for-loop completes,
        the ArrayList list contains only the unique elements of the original ArrayList
        (because duplicates of the largest elements have been removed),
         and the nth largest element can be found using the Collections.max() method.
         */
        System.out.println(Collections.max(list));
    }

}

