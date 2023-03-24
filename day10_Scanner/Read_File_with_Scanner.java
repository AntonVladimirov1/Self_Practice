package day10_Scanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Read_File_with_Scanner {
    public static void main(String[] args) throws IOException {

        Scanner scan=new Scanner(Path.of("src/Scanner_Day10/Test.txt"));

        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());

        scan.close();
    }
}
