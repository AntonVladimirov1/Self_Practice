package day21_Array_MultiDimensional;

import java.util.Arrays;

public class MultiDimensional_StringArray {
    public static void main(String[] args) {

        String[] group1 = {"Misha","Katya","Petya","Vasya"};
        String[] group2 = {"Kabob","Beblyab","Podamon"};
        String[] group3 = {"Karamba","Rytui","Weruyt","Detiytggv","Fopgyhersw"};
        String[] group4 = {"Doldo","Bolvan"};

        String[][] groups = {group1,group2,group3,group4};
           // to print all names in a row (forEach loop)
        for (String[] each1D : groups) {
            // can also to print each group => System.out.println(Arrays.toString(each1D));
            for (String names : each1D) {
                System.out.println(names);
            }
        }
        System.out.println("========================================");
            //  to print list of single arrays with list of names in each Array (fori loop)
        for (int i = 0; i < groups.length; i++) {
            String[] eachArr = groups[i];
            System.out.println(Arrays.toString(eachArr));
            for (int j = 0; j < eachArr.length; j++) {
                String eachName = eachArr[j];
                System.out.println(eachName);
            }
        }

    }
}
