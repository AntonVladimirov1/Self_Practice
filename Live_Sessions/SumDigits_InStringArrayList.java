package Live_Sessions;

import java.util.ArrayList;
import java.util.Arrays;

public class SumDigits_InStringArrayList {
    public static void main(String[] args) {

        ArrayList<String> digits = new ArrayList<>(Arrays.asList("123","52","513","1842"));
        ArrayList<Integer> sums = new ArrayList<>();

        for (String each : digits) {
            //System.out.println(each);
            String[] eachArr = each.split("");
            //System.out.println(Arrays.toString(eachArr));

            int sum =0;

            for (String eachDigit : eachArr) {
                //System.out.println(Integer.parseInt(eachDigit));
                sum+= Integer.parseInt(eachDigit);
            }
            sums.add(sum);
        }
        System.out.println(digits);
        System.out.println(sums);
    }
}
