package day39_Collection;

import java.util.*;

public class List_Demo {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.get(0);

        System.out.println("==========================================================");

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.remove(0);
        System.out.println(linkedList);
        linkedList.get(0);

        System.out.println("===========================================================");

        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(200);
        vector.add(300);
        System.out.println(vector);
        vector.get(0);

        System.out.println("===========================================================");

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);
        System.out.println(stack);
        stack.get(0);
        System.out.println(stack);


    }
}
