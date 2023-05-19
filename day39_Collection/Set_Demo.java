package day39_Collection;

import java.util.*;

public class Set_Demo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); //* follows the order, accepts duplicates, has index
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(list);

                                //* Set
        System.out.println("================================================================");
        Set<Integer> set1 = new HashSet<>();  //* No duplicates allowed, no order(random) and allows "null"
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90, null,null));
        System.out.println(set1);
        System.out.println("=============================================================");

        Set<Integer> set2 = new LinkedHashSet<>();  //* no duplicates, in order
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90, null,null));
        System.out.println(set2);
        System.out.println("=================================================================");

        Set<Integer> set3 = new TreeSet<>();  //* "null" not accepted, in order
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        //set3.addAll(Arrays.asList(10,200,300,40,90, null,null));
        System.out.println(set3);
        System.out.println("===================================================================");

        String[] words = {"Java","Java","Java","Python","Python","C#","Ruby","C#"};
        LinkedHashSet<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));
        System.out.println(result);
        /* for (String each : result) {
            System.out.println(each);
        }*/
        System.out.println(new ArrayList<>(result).get(1));
        words = result.toArray(new String[0]); //* converting Set to Array
        System.out.println("Words Array : "+Arrays.toString(words));

        System.out.println("====================================================================");

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,10,10,20,20,20,30,30,40,40,40,50,50,5,5,5,2,2,1,3,3,1));
       Set<Integer> n = new TreeSet<>(numbers); //* List to Set
        System.out.println(n);


    }
}
