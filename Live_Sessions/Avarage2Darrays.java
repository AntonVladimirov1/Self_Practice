package Live_Sessions;

import java.util.Arrays;

public class Avarage2Darrays {
    public static void main(String[] args) {

        int[][] nums = {{3,4,5,6,},{5,2,6,},{10,20,30}};

        double sumOfAll =0;
        int totalNumbersOfElements =0;
        for (int[] eachArr : nums) {
            double sumEach = 0;
            for (int eachNumber : eachArr) {
                sumEach +=eachNumber;
            }
            double average = sumEach/eachArr.length;
            System.out.println("average of "+ Arrays.toString(eachArr)+" is "+average);

            sumOfAll +=sumEach;
            totalNumbersOfElements +=eachArr.length;
        }
        System.out.println("tottalAvarage "+sumOfAll/totalNumbersOfElements);


    }
}
