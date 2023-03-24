package day19_Array;

public class MaxMinNumber {
    public static void main(String[] args) {


        int[] numbers = {100,20,500,40,-10,30,5,-15};

        int max = numbers[0]; //  assume that first element is the maximum number
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {  //  i: 1,2,3,4....
            if (numbers[i] > max){  //  compares the element of the array with current max number (or min with "<")
                max = numbers[i];  //  replace the current max number
            }else if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("max = " + max + "\nmin = "+min);

    }
}
