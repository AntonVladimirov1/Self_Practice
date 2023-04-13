package Live_Sessions.Costructor;

public class TestEncryption {
    public static void main(String[] args) {

        Encryption encryption = new Encryption("I want you",15,4);
        //System.out.println(encryption);

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("enter modify number");
        encryption.modifyNumber = scanner.nextInt();
        System.out.println("enter factor number");
        encryption.factorNumber = scanner.nextInt(); */
       // encryption.encrypt();
        System.out.println("=========================================");

        Encryption decryption = new Encryption("352 188 536 448 500 524 188 544 504 528",15,4);

       /* Scanner input = new Scanner(System.in);
        System.out.println("enter modify number");
        decryption.modifyNumber = input.nextInt();
        System.out.println("enter factor number");
        decryption.factorNumber = input.nextInt(); */
       decryption.decrypt();
       // System.out.println(decryption);

    }
}
