package day11_StringMethods;

public class StringMethod_2 {
    public static void main(String[] args) {

         // Replace - to replace every same words in the sentence to another (also can use replaceFirst)
        String sent1 ="I love Python very much, Python is the best";

        sent1 =sent1.replace("Python","Java");
        System.out.println(sent1);
        System.out.println("============================================");

        // Replace - to replace one character for another
        String word ="Java";
        word = word.replace('a','o');
        System.out.println(word);
        System.out.println("============================================");

        // SubString - to highlight word (or part of the sentence) from sentence
        String email ="l.a.v7232@gmail.com";
        int beginning =email.indexOf('@')+1;
        int ending =email.lastIndexOf('.');

        String domain =email.substring(beginning, ending);
        System.out.println(domain);
        System.out.println("============================================");

        // Repeat - to print several times (can be done with additions)
        String str ="Python";
        String result =(str+"\n").repeat(5);
        System.out.println(result);

    }
}
