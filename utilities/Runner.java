package utilities;

import java.util.Arrays;

public class Runner {

    static StringBuilder rev = new StringBuilder("dlrow olleH");

    public static String reverseStr(String str){
        String result="";

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String FinRa_FizBuzz(int num){
        String result = "";

             if (num%3==0) {
                result +="FIN";
            } if (num%5==0) {
                result +="RA";
            }
             return (result.isEmpty() ? "No result for "+num : result);
    }

    public static String EvenOdd(int num){
        return (num%2==0)? num+" is Even": num+" is Odd";
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

    public static int[]  sumUpToZero(int n){
        int[] res = new int[n];
        for (int i = 0; i < res.length-1; i++) {
            res[i++]=i;
            res[i]=-i;
        }
        return  res;
    }

    public static int[] generateArray(int N) {
        int[] arr = new int[N];
        // generating N/2 negative and N/2 positive
        for (int i = 0; i < N / 2; i++) {
            arr[i] = -(i + 1);
            arr[i + N / 2] = i + 1;
        }
        return arr;
    }

    public static int[] moveZerosToEnd(int[] arr){
        int[] result = new int[arr.length];
        int count = 0;

        for (int each : arr) {
            if (each != 0) {
                result[count++] = each;
            }
        }
        return result;
    }

    public static int[] moveZerosToEnd2(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {  // move non-zero elements to the front
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {  // Fill the remaining positions with zeros
            arr[index] = 0;
            index++;
        }
        return arr;
    }

    public static String findRepetitiveSubstring(String input) {
            int n = input.length();
            for (int len = 1; len <= n / 2; len++) {
                String candidate = input.substring(0, len);
                int repetitions = n / len;
                String repeatedCandidate = "";

                for (int i = 0; i < repetitions; i++) {
                    repeatedCandidate += candidate;
                }
                if (repeatedCandidate.equals(input)) {
                    return candidate;
                }
            }
            return "There is no repetitive substring";
        }

    public static void main(String[] args) {
        int[] nums = {1,0,2,0,3};
        System.out.println(Arrays.toString(moveZerosToEnd(nums)));
        System.out.println(findRepetitiveSubstring("abcabcabcabcabcabc"));
        System.out.println(Arrays.toString(sumUpToZero(4)));
        System.out.println(Arrays.toString(generateArray(7)));
        int[] nums2= {4,0,5,0,0,7,6,0,8,6};
        System.out.println(Arrays.toString(moveZerosToEnd(nums2)));
        System.out.println(EvenOdd(102));
        System.out.println(reverseStr("dlrow olleH"));
        System.out.println(rev.reverse());
        System.out.println(FinRa_FizBuzz(5));

    }
}



