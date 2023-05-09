package day37_Exceptions;

public class Try_Catch_blocks2 {
    public static void main(String[] args) {

        System.out.println("Program started");

        int[] arr = {1,2,3,4};

        try {
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Program ended");

    }
}
