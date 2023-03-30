package day22_ArrayList_WrapperClasses;

import utilities.ContainElement_inArray;

public class Test {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8};
        boolean has25 = ContainElement_inArray.contains(numbers,25);
        System.out.println(has25);
        System.out.println("======================================");

        String[] students = {"Masha","Glasha","Popka"};
        System.out.println(ContainElement_inArray.contains(students,"Masha"));

    }
}
