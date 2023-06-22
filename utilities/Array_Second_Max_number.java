package utilities;

public class Array_Second_Max_number {

    public static int findSecondMax777(int[] arr){
        int max = arr[0];
        int secMax = arr[0];

        for (int i : arr) {
            if (i > max){
                secMax = max;
                max = i;
            } else if (i > secMax && i < max) {
                secMax = i;
            }
        }
        return secMax;
    }

        //* this is ChatGPT
    public static int findSecondMax(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] numbers = {8,2,650,48,6,99,150,201};
        System.out.println(findSecondMax(numbers));

        System.out.println(findSecondMax777(numbers));
    }
}
