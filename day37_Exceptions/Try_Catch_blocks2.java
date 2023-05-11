package day37_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Try_Catch_blocks2 {
    public static void main(String[] args) {

        System.out.println("Program started");

        int[] arr = {1,2,3,4};

        try {
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
            e.printStackTrace(); // better always use this method
           // System.out.println(e.getMessage()); // but also can use message
        }
        System.out.println("Program ended");
        System.out.println("==========================================");

        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Something");

    }
}
