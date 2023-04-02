package Live_Sessions;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondMaxNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,1,9,5,2,4,8,4,8,7,8,12));
        System.out.println(list);

        int max = list.get(0);
        int secondMax = list.get(0);

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
