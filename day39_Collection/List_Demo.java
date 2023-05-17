package day39_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Demo {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("===========================================================");





    }
}
