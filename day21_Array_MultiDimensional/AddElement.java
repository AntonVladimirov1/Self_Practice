package day21_Array_MultiDimensional;

import utilities.AddElementToArray;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int element = 6;

        int[] newArray = Arrays.copyOf(array,array.length+1);
        newArray[newArray.length-1] = element;
        System.out.println(Arrays.toString(newArray));
        System.out.println("================================================");

        int[] numbers = {100,55,42,32,12};
        System.out.println(Arrays.toString(numbers));
        numbers = AddElementToArray.addElement(numbers,500);
        System.out.println(Arrays.toString(numbers));
        System.out.println("================================================");

        double[] nums = {100.2,55.3,42.8,32.6,12.5};
        System.out.println(Arrays.toString(nums));
        nums = AddElementToArray.addElement(nums,500.0);
        nums = AddElementToArray.addElement(nums,750.0);
        nums = AddElementToArray.addElement(nums,480.0);
        System.out.println(Arrays.toString(nums));
        System.out.println("================================================");

        String[] names = {"Koko","Vasya","Petya"};
        names = AddElementToArray.addElement(names,"Kakashka");
        System.out.println(Arrays.toString(names));

    }
}
