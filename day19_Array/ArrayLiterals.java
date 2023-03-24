package day19_Array;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {


        int[] numbers = new int[5]; // if you don't know what are those elements

        int[] nums = {10,20,30,40,50}; // if you exactly know what are those elements - "Array Literal"

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers) );
        System.out.println("nums = " + Arrays.toString(nums) );

        System.out.println("=============================================");

        String[] days = {"Monday ","Tuesday ","Wednesday ","Thursday ","Friday ","Saturday ","Sunday"};
        // index:           0          1         2          3          4         5         6
        int n =0; // n= index
        System.out.println( days[n+4] );
        System.out.println("=============================================");

        String[] month = {"Jan ","Feb ","Mar ","Apr ","May ","Jun ","Jul ","Aug ","Sep ","Oct ","Nov ","Dec "};
        System.out.println("month = " + Arrays.toString(month));
        System.out.println("==============================================");

        for (int i = month.length - 1; i >= 0; i--) {  //reverse
            System.out.print(month[i]);
        }

    }
}
