package day38_Exception_Handling;

import java.io.FileInputStream;

public class Throws_keyword2 {
    public static void main(String[] args) throws InterruptedException { // its not handling exception, just ignore it

        method1();

    }

    public static void pauseFor5Seconds() throws InterruptedException{
        Thread.sleep(5000, 0);
    }

    public static void method1() throws InterruptedException {
        System.out.println("First");
        pauseFor5Seconds();
        System.out.println("Second");
    }

    public static void method2() throws Exception{ //* this is parent class of all exception classes
        System.out.println("First started");

        Thread.sleep(3000);

        System.out.println("First ended");

        new FileInputStream("");

        Thread.sleep(5000);
    }
}
