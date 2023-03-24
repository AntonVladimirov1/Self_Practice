package day05_practice;

import java.util.Scanner;

public class Unary_Relational_Logical {
    public static void main(String[] args) {

        int salary = 135000;
        int creditScore = 750;
        boolean isEligible = salary >= 75000 && creditScore >= 745; // "And" sign
        System.out.println();
        System.out.println("IsEligible = " + isEligible);

        int salaru = 5000;
        int creditScor = 750;
        boolean isEligibl = salaru >= 75000 || creditScor >= 745; // "Or" sign
        System.out.println("IsEligible = " + isEligibl);
        System.out.println("---------------------------------------");

        int score = 85;
        if (score >= 70) {
            System.out.println("\tCongrats");
        } else {
            System.out.println("\tYou failed");

        }
    }
}
