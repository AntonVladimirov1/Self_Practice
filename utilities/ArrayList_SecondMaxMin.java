package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_SecondMaxMin {

    public static void main(String[] args) {

        ArrayList<String> str =new ArrayList<>(Arrays.asList("Anna","Canada","Bob","David","Lan","Abida","Ezra","Farida"));

        str.removeIf(p-> p.endsWith(p.substring(0,1).toLowerCase()));
        System.out.println(str);

        System.out.println("=============================================");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));
        list.removeAll(Arrays.asList(Collections.max(list)));
        list.removeAll(Arrays.asList(Collections.min(list)));
        System.out.println("second Max number: " + Collections.max(list));
        System.out.println("second Min number: " + Collections.min(list));
        System.out.println("=============================================");


    }
}

