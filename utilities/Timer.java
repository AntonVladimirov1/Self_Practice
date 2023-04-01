package utilities;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter time (minutes):");
        int minutes = scan.nextInt();
        scan.close();

        for (int i = minutes; i >0 ; i--) {
            for (int z = 59; z >=0; z--) {
                System.out.println("\r"+(i-1)+"minutes and "+z+" seconds left");
                Thread.sleep(1000);
            }
        }
        System.err.println("Time is UP");

    }
}
