package utilities;

public class Runner3 {

    public static double magicDivision(int number, int divider) {
        if (number == 0) {
            return 0;
        }
        if (divider == 0) {
            throw new ArithmeticException("divider can not be 0");
        }
        int sign = 1;
        if (number < 0 && divider > 0 || number > 0 && divider < 0) {
            sign = -1;
        }
        number = Math.abs(number);
        divider = Math.abs(divider);
        int intCount = 0;
        while (number >= divider) {
            number -= divider;
            intCount++;
        }
        double decimalCount = 0;
        if (number!=0) {
            number = number * 10;
            while (number>=divider){
                number-=divider;
                decimalCount+=0.1;
            }
        }
        return (intCount+decimalCount)*sign;
    }


    public static int[] sortASC(int[] arr) {
        // Perform selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            // Find the index of the minimum element in the remaining unsorted portion of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static int[] sortDESC(int[] arr) {
        // Perform selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            // Find the index of the maximum element in the remaining unsorted portion of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the maximum element with the current element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
