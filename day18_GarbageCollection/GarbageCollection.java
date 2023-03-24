package day18_GarbageCollection;

public class GarbageCollection {
    public static void main(String[] args) {

        String s1 = "Java";
        s1 = null;   // "Java" will be eligible for garbage collection

        System.out.println("===================================");

        String str1 = "Python";   // once reassigned variable to another object - old object gone forever!!!
        str1 = "Cydeo";
        System.out.println(str1);

        System.out.println("===================================");



    }

}
