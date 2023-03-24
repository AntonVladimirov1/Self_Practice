package day04_practice;

import java.sql.SQLOutput;

public class Primitive_Type_Casting {
    public static void main(String[] args) {

        //-----IMPLICIT Casting ---(from bigger to smaller)---

        byte a = 15;
        short b = a;
        // short b = (short)a;

        System.out.println(b);

        int c = a; // implicit casting

        long d = 3000L;
        float e = d;
        System.out.println(e);

        //-----EXPLICIT Casting ---(from smaller to bigger)---

        int x = 100;
        byte y = (byte) x;

        float z = 20.8F;
        short q = (short) z; // then z convert to short = 20
        System.out.println(q);

        double n1 = 2.5;
        byte n2 = (byte) n1; // then n1 convert to byte = 2
        System.out.println(n2);

    }
}
