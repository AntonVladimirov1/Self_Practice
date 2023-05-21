package Live_Sessions.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        // remove all the elements less than 5
        List<Integer> list =new ArrayList<>(Arrays.asList(4,2,5,8,9,7,6,7,5,8,2,3,1));
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if (it.next()<5){
                it.remove();
            }
        }
        System.out.println(list);

    }
}
