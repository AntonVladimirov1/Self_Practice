package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods1 {
    public static void main(String[] args) {
                    /// Min/Max methods
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println(min+" "+max);
        System.out.println("==================================================================");
                    /// Sort method - alphabet order
        ArrayList<String> girls = new ArrayList<>();
        girls.addAll(Arrays.asList("Masha","Katya","Olya","Anya","Kira","Natasha","Lejla"));
        Collections.sort(girls);
        System.out.println(girls);
        System.out.println("==================================================================");
                    /// Reverse method
        Collections.reverse(girls);
        System.out.println(girls);
        System.out.println("==================================================================");
                   /// Swap method
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        Collections.swap(numbers,0,12);
        //Collections.swap(numbers,0,numbers.size()-1); //* or like this
        System.out.println(numbers);

    }
}
