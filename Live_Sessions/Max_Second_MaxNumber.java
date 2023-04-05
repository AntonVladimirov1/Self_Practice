package Live_Sessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Max_Second_MaxNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,599,1,9,5,2,4,25,4,84,7,8,12));
        System.out.println(list);

        int max = Integer.MIN_VALUE;         //* can be - list.get(0);
        int secondMax = Integer.MIN_VALUE;   //* can be - list.get(0);
        for (Integer each : list) {
            if (each > max){
                secondMax = max;
                max = each;
            }
            if (each > secondMax && each<max){
                secondMax=each;
            }
        }
        System.out.println("Max = "+max);
        System.out.println("SecondMax = "+secondMax);
        System.out.println("==============================================================================");
                             //* different approach with "Collection.sort" at the beggining

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(192,93,18,4,15,15,2,4,7,8,4,8,91,75));
        System.out.println(list2);

        Collections.sort(list2);  //* using SORT method
        int max2 =list2.get(0);
        int secondMax2 =list2.get(0);
        for (int each : list2) {
            if(each > max2){
                secondMax2 =max2;
                max2 =each;
            }
        }
        System.out.println("Max = "+max2);
        System.out.println("Second max = "+secondMax2);


    }
}
