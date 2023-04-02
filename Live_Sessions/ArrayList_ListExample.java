package Live_Sessions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_ListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        System.out.println(list);

        ArrayList<Integer> list2 =new ArrayList<>(Arrays.asList(3,5,10));
        System.out.println(list2);

        ArrayList<Integer> list3 =new ArrayList<>(list2); // creates new object
        list3.add(0,100);
        System.out.println(list3);

        ArrayList<Integer> list4 = list3;  // reference to the "list3" object
        System.out.println(list4);

    }
}
