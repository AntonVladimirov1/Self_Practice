package utilities;

public class TryCatch {

    public static void main(String[] args) throws Exception {
        try {
            System.out.println("A"); // This line prints "A" to the console.
            System.out.println(hello()); // This calls the hello() method.
            System.out.println("B"); // This line prints "B" to the console.
        } catch (Exception e) {
            System.out.println("C"); // This line prints "C" to the console.
        }
    }

    public static String hello() throws Exception {
        try {
            System.out.println("1"); // This line prints "1" to the console.
            throw new Exception(); // This line throws an exception.
        } catch (Exception e) {
            System.out.println("2"); // This line prints "2" to the console.
            return "X"; // This line returns "X".
        } finally {
            System.out.println("3"); // This line prints "3" to the console.
        }
    }

}
