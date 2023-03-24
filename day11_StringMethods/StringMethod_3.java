package day11_StringMethods;

public class StringMethod_3 {
    public static void main(String[] args) {

        // isEmpty - check if characters present in the string
        String word ="J";
        boolean r1 =word.isEmpty();
        System.out.println(r1);
        System.out.println("=============================");

        // isBlanc - if nothing but white spaces present
        String str ="          ";
        boolean r2 =str.isBlank();
        System.out.println(r2);
        System.out.println("=============================");

        // Contains - to determine if the string contains some value
        String student ="Garry, Pedro, John, Anton";
        boolean hasAnton =student.contains("Anton");
        System.out.println(hasAnton);
        System.out.println("==============================");

        // StartsWith or EndsWith


    }
}
