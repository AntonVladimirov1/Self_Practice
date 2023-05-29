package utilities;

public class StringReverse {

    public static String reverse(String str){
        String reverse =""; // to contain all the characters of the given string in reversed order

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i); // to get each character of the string from last index to index zero
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse("public hub"));
    }
}
