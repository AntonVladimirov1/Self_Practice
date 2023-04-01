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
        groceriestList.remove(0);  /// by Index  or for Digits--(Integer.valueOf(10));
        System.out.println(groceriestList);
        groceriestList.remove("Onion");  /// by Object
        System.out.println(groceriestList);
        System.out.println("=================================");
               /// CLEAR method - clearing the whole ArrayList
        groceriestList.clear();
        System.out.println(groceriestList);
        System.out.println("=================================");
               /// IndexOf/lastIndexOf methods - returns fist occurance from the beggining/from the end
        ArrayList<String> names = new ArrayList<>();
        names.add("Vasya");
        names.add("Petya");
        names.add("Masha");
        names.add("Katya");
        names.add("Vasya");
        System.out.println(names.indexOf("Vasya"));
        System.out.println(names.lastIndexOf("Vasya"));


    }
}
