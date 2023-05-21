package Live_Sessions.Collection;

import java.util.*;

public class ListTypes {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(Arrays.asList("a","b","c",null,"z","b"));
        list1.add("MK");
        System.out.println(list1);


        List<String> list2 = new LinkedList<>(Arrays.asList("a","b","c",null,"z","b"));
        System.out.println(list2);

        List<String> list3 = new Vector<>(Arrays.asList("a","b","c",null,"z","b"));
        System.out.println(list3);

    }

}
