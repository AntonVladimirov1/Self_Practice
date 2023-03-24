package day11_StringMethods;

public class String_Char_Length_Index {
    public static void main(String[] args) {

        String str="Memo";
        // index:   0123

        char firstChar= str.charAt(0);
        char second= str.charAt(1);
        char third=str.charAt(2);
        char fourth=str.charAt(3);

        System.out.println(firstChar);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);

        System.out.println("================================");
        // Length of sentence
        String sentence= "jhgjh hgjhgjh JH jhgjhJHJHG";

        int length= sentence.length();
        System.out.println(length);

        int lastIndex= length - 1;
        System.out.println(lastIndex);

        System.out.println("================================");
        //need to find first and last characters
        String s1= "Java is the most popular language";

        char f= s1.charAt(0);
        int lastIndexNum= s1.length() -1;
        char l= s1.charAt(lastIndexNum);

        System.out.println(f+" / "+l);



    }
}
