package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,10,30,70));
                   /// ADD method - adding elements to ArrayList

        list.add(1,50);            //* inserting another element in 1 index place
        System.out.println(list);
        System.out.println("=====================================");
                        /// GET method - to get(print) chosen elements from ArrayList
        ArrayList<String> student = new ArrayList<>();
        student.add("Vasya");
        student.add("Petya");
        student.add("Katya");
        student.add("Masha");
        System.out.println(student.size());
        System.out.println(student);
        
        String firstStudent = student.get(0);
        System.out.println(firstStudent);
        String lastStudent = student.get(student.size()-1);
        System.out.println(lastStudent);
        System.out.println("=======================================");
                       /// CONTAINS mehtod - to check if ArrayList contains element
        boolean hasMasha = student.contains("Masha");
        boolean hasKolya = student.contains("Kolya");
        System.out.println(hasMasha+" / "+hasKolya);
        System.out.println("=======================================");
                       /// EQUALS method - can compare two ArrayList for exact match

    }
}
