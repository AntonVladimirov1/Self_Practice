package day19_Array;

import java.util.Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {

        String students[] = new String[5];

        students [0] = "Vasya";
        students [1] = "Popa";
        students [2] = "Zopa";
        students [3] = "Govno";
        students [students.length-1] = "Pisya";

        System.out.println(Arrays.toString(students));
        students[2] = "Pizda"; // reassign
        System.out.println(Arrays.toString(students));
        System.out.println("=============================");

        for (int i = students.length-1; i >= 0; i--) {
            System.out.println(students[i]);
        }
        System.out.println("=============================");

        for (int i = students.length - 1; i >= 0; i--) {

        }

    }
}
