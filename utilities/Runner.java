package utilities;

import java.util.Arrays;

public class Runner {

    public static String FINRA(int num){
        String result ="";
        for (int i = 1; i <= num ; i++) {
            if (i%3==0 && i%5==0){
                result=(i+" =FINRA");
            } else if (i%3==0) {
                result=(i+" =FIN");
            } else if (i%5==0) {
                result=(i+" =RA");
            }else {
                result=("No option for - "+i);
            }
        }
        return result;
    }

    public static void EvenOdd(int num){
        if (num%2==0){
            System.out.println(num+" - is even number");
        }else {
            System.out.println(num+" - is odd number");
        }
    }

    public static int[] evenFromArray1(int[] arr) {
        int count = 0;
        // Count the number of even numbers in the array
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        // Create a new array to store the even numbers
        int[] evenNum = new int[count];
        // Fill the new array with the even numbers from the original array
        int k = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenNum[k] = i;
                k++;
            }
        }
        return evenNum;
    }

    public static int[] evenFromArray2(int[] arr) {
        return Arrays.stream(arr).filter(num -> num % 2 == 0).toArray();
    }

    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println(Arrays.toString(evenFromArray1(numbers)));
        System.out.println(Arrays.toString(evenFromArray2(numbers)));

        System.out.println(FINRA(11));

    }
}


