package Live_Sessions.Collection;

import java.util.*;

public class SetTypes {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(Arrays.asList("zebra","Java","8","#$%",null,"Java","!hi","8"));
        System.out.println(set1);

        Set<String> set2 = new LinkedHashSet<>(Arrays.asList("zebra","Java","8","#$%",null,"Java","!hi","8"));
        System.out.println(set2);

        Set<String> set3 = new TreeSet<>();
        set3.add("zebra");
        set3.add("Java");
        set3.add("8");
        set3.add("#$%");
        set3.add("Java");
        set3.add("!hi");
        set3.add("8");
        //set3.add(null);
        System.out.println(set3);

        String str = "AAAABBBCCCDDEEEFF";
        System.out.println(new LinkedHashSet<>(Arrays.asList(str.split(""))).toString().replace("[","").replace("]",""));

        Set<String> tabs = new HashSet<>(); //* example when you have to work with different browser tabs
        tabs.add("GJHGJH1");
        tabs.add("YTRYTR2");
        tabs.add("FDSFuyt3");
        for (String each : tabs){
            if (each.equals("GJHGJH1")){
                // switch to that tab (here will be automated code)
                System.out.println("Switched");
            }
        }


    }
}
