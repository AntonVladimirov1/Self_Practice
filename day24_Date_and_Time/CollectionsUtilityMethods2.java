package day24_Date_and_Time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods2 {
    public static void main(String[] args) {
                            /// ReplaceAll method
        ArrayList<String > names = new ArrayList<>(Arrays.asList("Java","Java","Java","C#","C#","Swift","Swift","Java","Ruby"));
        System.out.println(names);
       /*            // can use fori loop
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase("Java")){
                names.set(i,"Python");
            }
        }*/
        Collections.replaceAll(names,"Java","Python"); // need to pass List name, old value, new value
        System.out.println(names);
        System.out.println("===========================================================================");
                         /// Frequency mehtod
        A

    }
}
