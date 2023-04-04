package day24_Date_and_Time;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbbbcccccdd";
        String result = "";  // a3b4c5

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);

            if (!result.contains(each)){
                result+= each + frequency;
            }
        }
        System.out.println(result);


    }
}
