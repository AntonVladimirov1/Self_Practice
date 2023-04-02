package Live_Sessions;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {

        String result = "About 42,100,000 results (0.44 seconds) ";
        String[] eachPart = result.split(" ");
        System.out.println(Arrays.toString(eachPart));
        System.out.println(eachPart[1]);

        long resultNum = Long.parseLong(eachPart[1].replace(",",""));

        if (resultNum <100_000_000){
            System.out.println("Good Search");
        }else {
            System.out.println("Narrow your search. Too many results: "+resultNum);
        }
        System.out.println(eachPart[3]);
        double resultTime = Double.parseDouble(eachPart[3].substring(1));

        if (resultTime <= 0.85){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

    }
}
