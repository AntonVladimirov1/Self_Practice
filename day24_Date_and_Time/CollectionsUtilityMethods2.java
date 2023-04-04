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
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(10,20,20,30,40,50,50,50,50,60,60,50,50,60,50));
        int count = Collections.frequency(list,50); // need to provide List name and element
        System.out.println(count);     // how many times "50" repeats
        System.out.println("===========================================================================");

        ArrayList<String > words = new ArrayList<>(Arrays.asList("Java","Java","Java","C#","C#","Swift","Swift","Java","Ruby"));
        int count1 = Collections.frequency(words,"Java");
        System.out.println(count1);
        System.out.println("===========================================================================");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,20,30,40,50,50,50,50,60,60,50,50,60,50));

        for (Integer each : numbers) {
            if (Collections.frequency(numbers,each) == 1){
                System.out.println(each);
            }
        }

    }
}
