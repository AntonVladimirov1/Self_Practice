package day11_StringMethods;

public class StringMethod_1 {
    public static void main(String[] args) {

        //Lower case
        String str1 ="JAVA PROG";
        str1 =str1.toLowerCase(); // "java prog" (reassign variable)
        System.out.println(str1);

        System.out.println("=================================");

        //Upper case
        String str2 ="kukushka popkina";
        str2 =str2.toUpperCase();
        System.out.println(str2);

        System.out.println("=================================");

        //Trim (removes white spaces)
        String str4 ="    Kuku  ";
        str4 =str4.trim();
        System.out.println(str4);

        System.out.println("=================================");

        //IndexOf (also exist lastIndexOf - from the end of sentence)
        String sent ="JHjf fgkh, sdfkhu JHG jggui";
        int index =sent.indexOf('s');
        System.out.println(index);
    }
}
