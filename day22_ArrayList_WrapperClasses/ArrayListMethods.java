package day22_ArrayList_WrapperClasses;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);   // adding elements to ArrayList
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(70);

        list.add(1,50); // inserting another element in 1 index place
        System.out.println(list);


    }
}
