package Live_Sessions.Costructor;

import java.util.Scanner;

public class TestEncryption {
    public static void main(String[] args) {

        Encryption encryption = new Encryption("james bond");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter modify number");
        encryption.modifyNumber = scanner.nextInt();
        System.out.println("enter factor number");
        encryption.factorNumber = scanner.nextInt();
        encryption.encrypt();

    }
}
