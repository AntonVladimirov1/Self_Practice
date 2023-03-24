package day19_Array;

import java.util.Arrays;

public class Array_A_Z_DESC_ASC {
    public static void main(String[] args) {

        char[] asc = new char[26];
        char[] desc = new char[26];

        for (int i = 0, j = 'A', k ='Z'; i < asc.length; i++, j++, k--) {
            asc[i] = (char) j;
            desc[i] = (char)k;
        }
        System.out.println(Arrays.toString(asc));
        System.out.println(Arrays.toString(desc));
        System.out.println("=====================================================");

        char[] characters = new char[65535];

        for (int i = 0; i < characters.length; i++) {

            characters[i] = (char) i;
        }
        System.out.println(Arrays.toString(characters));

    }
}
