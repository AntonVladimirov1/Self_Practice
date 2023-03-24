package day09_Scanner;


public class Biggest_number {
    public static void main(String[] args) {

        int x= 50;
        int y= 150;
        int z= 50;

        int largestNumber = (x>y)? (x>z ? x : z) : (y>z ? y : z);
        System.out.println(largestNumber);
        System.out.println("=========================================");

    }
}
