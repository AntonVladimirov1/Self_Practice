package utilities;

public class Array_Second_Max_number {

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
        int[] numbers = {8,2,65,48,6,99,150,201};
        System.out.println(findSecondMax(numbers));
    }
}
