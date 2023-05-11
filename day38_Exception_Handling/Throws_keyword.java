package day38_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_keyword {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException { // only use with checked (obvious) exception

        System.out.println("Start1");

        //System.out.println(100/0);
        Thread.sleep(3000, 0);

        System.out.println("End");
        System.out.println("==================================");

        System.out.println("Start2");

        //System.out.println(100/0);
        Thread.sleep(3000, 0);

        System.out.println("End");
        System.out.println("==================================");

        System.out.println("Start3");
        FileInputStream file = new FileInputStream("");
        System.out.println("End");

    }
}
