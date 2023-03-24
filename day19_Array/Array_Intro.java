package day19_Array;

import java.util.Arrays;

public class Array_Intro {
    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 65;
        int score4 = 55;
        int score5 = 45;

        System.out.println("=============================");

        int scores[] = new int [5]; // index: 0 ~ 4
        scores[0] = 85;
        scores[1] = 75;
        scores[2] = 65;
        scores[3] = 55;
        scores[4] = 45;
        System.out.println(Arrays.toString(scores));

        System.out.println(scores[2]);
        System.out.println("==============================");

        for (int i = 0; i < scores.length; i++) { // i: index numbers of scores array
            System.out.println(scores[i]);
        }
        System.out.println("===============================");

        System.out.println(scores[scores.length-1]);

    }
}
