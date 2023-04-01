package day23_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasya");
        names.add("Petya");
        names.add("Masha");
        names.add("Katya");
        names.add("Vasya");
        names.add("Kiki");
        names.add("Petya");
        names.add("Vasya");

        ArrayList<String> nonDup = new ArrayList<>();
        for (String each : names) {
            if (nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }
        System.out.println(nonDup);
        //*names=nonDup; System.out.println(names); - can be reassigned to a new ArrayList

    }
}
