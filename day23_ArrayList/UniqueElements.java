package day23_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
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

        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
               // break; ///can add to stop after first unique element
            }
        }

    }
}
