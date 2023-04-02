package Live_Sessions;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondMaxNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,599,1,9,5,2,4,25,4,584,7,8,12));
        System.out.println(list);

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;             //list.get(0);

        for (Integer each : list) {

            if (each > max){
                secondMax = max;
                max = each;
            }
            if (each > secondMax && each<max){
                secondMax=each;
            }
        }
        System.out.println("Max num: "+max);
        System.out.println("SecondMax: "+secondMax);



    }
}
