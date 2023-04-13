package Live_Sessions.Costructor;

public class Encryption {

    public String message;
    public int modifyNumber;
    public int factorNumber;

    public Encryption(String message) {
        this.message = message;
    }
    public Encryption(String message, int modifyNumber, int factorNumber) {
        this(message);
        this.modifyNumber = modifyNumber;
        this.factorNumber = factorNumber;
        encrypt();
    }
    public void encrypt(){
        String encrypted = "";
        for (char each : message.toCharArray()) {
            int result = (each+modifyNumber)*factorNumber;
            encrypted+=result+" ";
        }
        System.out.println(encrypted.trim());
    }

    public void decrypt(){
        String decrypted ="";
        for (String each : message.split(" ")) {
            int dec = Integer.parseInt(each);
            char ch = (char) (dec/factorNumber-modifyNumber);
            decrypted+=ch;
        }
        System.out.println(decrypted.trim());
    }

}
