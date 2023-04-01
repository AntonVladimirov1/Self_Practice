package day23_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<String> groceriestList = new ArrayList<>();
        groceriestList.add("Eggs");
        groceriestList.add("Milk");
        groceriestList.add("Onion");
        groceriestList.add("Kaka");
        System.out.println(groceriestList);
        System.out.println("=================================");
               /// SET method - to update element in ArrayList
        groceriestList.set(3,"Apple");
        System.out.println(groceriestList);
        System.out.println("=================================");
              /// REMOVE method - opposite to ADD
        groceriestList.remove(0);  // by Index number
        System.out.println(groceriestList);
        groceriestList.remove("Onion");  // by Object
        System.out.println(groceriestList);
        System.out.println("=================================");


    }
}
