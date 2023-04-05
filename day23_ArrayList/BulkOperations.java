package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
                     /// "addAll method" - adding one ArrayList into another
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list1.addAll(2,numbers);
        System.out.println(list1);
        System.out.println("=======================================================");
                        /// "asList method" - can add multiple element at once in addAll method
        ArrayList<Integer> score = new ArrayList<>();
        score.addAll(Arrays.asList(75,85,95,70,80));
        System.out.println(score);

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Masha","Katya","Olya","Kira"));
        System.out.println(names);
                                               //* to add additional elements to the specific index of existing ArrayList
        names.addAll(2,Arrays.asList("Natasha","Lejla"));
        System.out.println(names);
        System.out.println("=======================================================");
                                               //* adding elements of the Array to the ArrayList
        Integer[] nums = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> l1 =new ArrayList<>(Arrays.asList(nums));   //* second option
        //l1.addAll(Arrays.asList(nums)); //* first option
        System.out.println(l1);
        System.out.println("=======================================================");
                        /// "containesAll method" - to check if multiple elements are present in ArrayList
        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Masha","Katya","Olya","Kira","Natasha","Lejla"));
        boolean hasKiraOlya = employeeList.containsAll(Arrays.asList("Kira","Olya"));
        System.out.println(hasKiraOlya);
        System.out.println("=======================================================");
                        /// "removeAll method"- can remove all chosen elements at once
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,20,30,40,50,60,70,10,10,80,10,10,20));
        list.removeAll(Arrays.asList(10,20));
        System.out.println(list);
                        /// "retainAll method" - can retain all chosen elements and remove the rest
        ArrayList<String> people = new ArrayList<>();
        people.addAll(Arrays.asList("Masha","Katya","Olya","Kira","Natasha","Lejla"));
        people.retainAll(Arrays.asList("Katya","Masha","Lejla"));
        System.out.println(people);

    }
}
