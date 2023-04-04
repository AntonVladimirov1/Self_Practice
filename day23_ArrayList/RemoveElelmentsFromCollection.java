package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElelmentsFromCollection {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        System.out.println(list);
                 /// RemoveIf method !!!!!!!!!
        /* for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4){
                list.remove(i);
            }
        }
        System.out.println(list);*/
        list.removeIf(p -> p<4); /// VERY IMPORTANT: "p->" and then put condition
        System.out.println(list);


    }
}
/* Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]*/
