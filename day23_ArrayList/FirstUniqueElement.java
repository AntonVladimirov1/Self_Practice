package day23_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        System.out.println(list);
            // to find how many times chosen element repeated
        /*int element = 1;
        int frequency = 0;
        for (Integer each : list) {
            if (each == element){
                frequency++;
            }
        }
        System.out.println(element+" repeated: "+frequency+" times");*/

        for (Integer element : list) {

            int frequency = 0;
            for (Integer each : list) {
                if (each == element){
                    frequency++;
                }
            }
            if (frequency ==1){
                System.out.println(element);
                // break;  - exiting the loop when found first unique element
            }
        }

    }
}
