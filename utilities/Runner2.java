package utilities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Runner2 {

    public static boolean isPrime(int num){
        if (num<=1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int reverseInt(int number) {
        boolean isNegative = number < 0;
        if(isNegative){
            number = number * -1;
        }
        int reverse = 0;
        while (number >= 1) {
           int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return isNegative ? reverse*-1 : reverse;
    }

    public static int reverseAnyInt(int num){  // Reverse Integer (any)
        int reversed = 0;
        for (; num !=0; num /=10){
            int lastDigit = num % 10;
            reversed = reversed *10 + lastDigit;
        }
        return reversed;
    }

    public static String noDuplication(String str){
        String result = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (result.contains(str.charAt(i)+"")){
                continue;
            }
            result+= str.charAt(i);
        }
        return result;
    }

    public static String freqChar(String str){
        String result = "";
        str = str.toLowerCase();
        for (int a = 0; a < str.length(); a++) {
            int count = 0;
            for (int b =0; b< str.length(); b++){
                if (str.charAt(b) == str.charAt(a) ){
                    count++;
                }
            }
            if (result.contains(str.charAt(a)+"")){  // to avoid duplication
                continue;
            }
            result+= str.charAt(a)+ "" +count+ " ";
        }
        return result;
    }

    public static Boolean compareStrings(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }

    public static String reversed(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result+= str.charAt(i);
        }
        return result;
    }



    public static void main(String[] args) {

        String str = "Hello, World!";         // freqChar (Collection)
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : str.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

       /* String str ="gnihtemos";  // simple String reverse
        String rvsd = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            rvsd+=str.charAt(i);
        }
        System.out.println(rvsd);

        System.out.println(compareStrings("ABEFgcd", "abcdEFg"));

        System.out.println(noDuplication("agrFffuuuUUccCCckkk"));

        System.out.println(reverseAnyInt(-654321));

        System.out.println(reverseInt(-1234567));

        System.out.println(isPrime(11));

        StringBuilder coolStuff = new StringBuilder("emoclew");    //* very cool thing!!!
        System.out.println(coolStuff.reverse());

        System.out.println(reversed("emOClew"));

        System.out.println(freqChar("aafabbbklddccccFFFFF"));

        */
    }

}
