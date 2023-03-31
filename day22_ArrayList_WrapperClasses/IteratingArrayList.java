package day22_ArrayList_WrapperClasses;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);
        System.out.println(numbers);
        System.out.println("=================================");
                      // strait loop
        for (int i = 0; i < numbers.size(); i++) {
            int each = numbers.get(i);      // or System.out.println(numbers.get(i));
            System.out.println(each);
        }
        System.out.println("==================================");
                     // reversed loop
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
        System.out.println("==================================");
                       // for each loop
        for (Integer each : numbers) {
            System.out.println(each);
        }

    }
}
