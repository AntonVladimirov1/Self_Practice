package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(192,93,18,4,15,15,2,4,7,8,4,8,91,75));

        Collections.sort(list);  //* using SORT method

        int max=list.get(0);
        int secondMax=list.get(0);
        for (int each : list) {
            if(each>max){
                secondMax=max;
                max=each;
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Second max = "+secondMax);


    }
}

