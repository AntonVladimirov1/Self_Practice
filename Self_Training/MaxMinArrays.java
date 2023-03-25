package Self_Training;

public class MaxMinArrays {
    public static void main(String[] args) {

        int[] num = {10,50,70,80,30,485,269,3,45};

        int max = num[0];
        int min = num[0];

        for (int i = 1; i < num.length; i++) {  //  i: 1,2,3,4....
            if (num[i] > max){
                max = num[i];
            }else if (num[i] < min){
                min = num[i];
            }
        }
        System.out.println("max = " + max + "\nmin = "+min);

        }

    }

