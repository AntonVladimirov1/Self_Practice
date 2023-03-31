package day22_ArrayList_WrapperClasses;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
                   // ADD method
        list.add(10);   // adding elements to ArrayList
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(70);
        list.add(1,50); // inserting another element in 1 index place
        System.out.println(list);
        System.out.println("=====================================");
                        // GET method
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

    }
}
