package utilities;

import java.util.*;

public class Runner2 {

    public static boolean isPalindrome(String str){
        str=str.toLowerCase();
        for (int begin = 0,end = str.length()-1; begin <str.length()/2 ; begin++, end--) {
            if (str.charAt(begin) != str.charAt(end)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome2(String str) {
        str=str.toLowerCase();
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        }

    public static String FinRa_FizBuzz(int num){
        String result ="";

        if (num%3==0) {
            result +="FIN";
        } if (num%5==0) {
            result +="RA";
        }
        return (result.isEmpty() ? "No result for "+num : result);
    }

    public static boolean isPrime(int num){
        if (num<=1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {  // Check if the lengths of the strings are equal
            return false;                // otherwise it's not anagram anyway
        }
        char[] aArr = a.toCharArray(); // Convert strings to char arrays and sort them
        char[] bArr = b.toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        return Arrays.equals(aArr, bArr); // Compare the sorted arrays
    }
    public static boolean isAnagramTreeSet(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        Set<String> a1 =  new TreeSet<>(Arrays.asList(a.split("")));
        Set<String> b1 =  new TreeSet<>(Arrays.asList(b.split("")));
        return a1.equals(b1);
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
            result+= str.charAt(a)+ ":" +count+ " ";
        }
        return result;
    }
    public static String freqOfCharCollection(String str){
        String result="";
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : str.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            result+=entry.getKey() + ":" + entry.getValue()+" ";
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
        str= str.toLowerCase();
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result+= str.charAt(i);
        }
        return result;
    }

    public static int sumOfTwoDigits(int n){
        int sum = n / 10 + n % 10;
        return sum;
    }

    public static int sumOfManyDigits(int a){
        int sum = 0;
        String b=""+ a;
        //System.out.println("b = " + b);
        for (int i = 0; i < b.length(); i++) {
            sum= sum + Integer.parseInt(""+b.charAt(i));
        }
        return sum;
    }




public static void main(String[] args) {

    StringBuilder StrReversed = new StringBuilder("emoclew");    //* very cool thing!!!
        System.out.println(StrReversed.reverse());
        System.out.println(reversed("emOClew uoy kcuf"));
        System.out.println(freqChar("collection"));
        System.out.println(freqOfCharCollection("collection"));
        System.out.println(compareStrings("ABEFgcd", "abcdEFg"));
        System.out.println(noDuplication("argFffuuuUUccCCckkkit"));
        System.out.println(reverseAnyInt(-654321));
        System.out.println(reverseInt(-1234567));
        System.out.println(isPrime(11));

    Random random = new Random();
        int randomNumber = random.nextInt(100);   // randomly printing numbers limited to 100
        System.out.println(randomNumber);
        System.out.println(sumOfTwoDigits(55));
        System.out.println(sumOfManyDigits(5555));
        System.out.println(isPalindrome("raCecar"));
        System.out.println(isPalindrome2("anNa"));
        System.out.println(FinRa_FizBuzz(15));
        System.out.println(isAnagram("anagram", "margana"));
        System.out.println(isAnagramTreeSet("anagram", "margana"));

}

}
