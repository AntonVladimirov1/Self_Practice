package utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>()
;
        list.addAll(Arrays.asList(1,2,3,4,5));
        list.set(0, list.get(4));
        list.set(4, list.get(0));
        System.out.println(list);
        System.out.println("==============================");

        ArrayList<Character> list2 = new ArrayList<>();

        for (char i = 'a'; i <= 'z' ; i++) {
            list2.add(i);
        }
        boolean r = list2.containsAll(Arrays.asList('a','c','D'));
        System.out.println(r);
        System.out.println("=====================================");

        ArrayList<Integer> nums =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        for (Integer each : nums) {
            if (each%2 !=0){
                continue;
            }
            System.out.println(each);
            break;
        }

    }
}

