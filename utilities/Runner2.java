package utilities;

import java.util.*;

public class Runner2 {

    public static String reversed(String str){
        str= str.toLowerCase();
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result+= str.charAt(i);
        }
        return result;
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

    public static String removeDuplicates(String str){
        str=str.toLowerCase();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (result.contains(""+str.charAt(i))){
                continue;
            }
            result += str.charAt(i);
        }
        return result;
    }

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
    public static boolean compareStrings(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }

    private static void isPanagram(String str) {
        str=str.toLowerCase();
        str=str.replace(" ","");
        Set<Character> panagramSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if(c>=97 && c<=122){
                panagramSet.add(c);
            }
        }
        if(panagramSet.size()==26){
            System.out.println( str +" (size = " +panagramSet.size()+") || Panagram");
        }else {
            System.out.println( str +" (size = " +panagramSet.size()+") || NOT Panagram");
        }
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

    public static String EvenOdd(int num){
        return (num%2==0)? num+" is Even": num+" is Odd";
    }

    public static int[] evenFromArray1(int[] arr) {
        int count = 0;
        // Count the number of even numbers in the array
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        // Create a new array to store the even numbers
        int[] evenNum = new int[count];
        // Fill the new array with the even numbers from the original array
        int k = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenNum[k] = i;
                k++;
            }
        }
        return evenNum;
    }

    public static int[] evenFromArray2(int[] arr) {
        return Arrays.stream(arr).filter(num -> num % 2 == 0).toArray();
    }

    public static int[]  sumUpToZero(int n){
        int[] res = new int[n];
        for (int i = 0; i < res.length-1; i++) {
            res[i++]=i;
            res[i]=-i;
        }
        return  res;
    }

    public static int[] generateArray(int N) {
        int[] arr = new int[N];
        // generating N/2 negative and N/2 positive
        for (int i = 0; i < N / 2; i++) {
            arr[i] = -(i + 1);
            arr[i + N / 2] = i + 1;
        }
        return arr;
    }

    public static int[] moveZerosToEnd(int[] arr){
        int[] result = new int[arr.length];
        int count = 0;

        for (int each : arr) {
            if (each != 0) {
                result[count++] = each;
            }
        }
        return result;
    }

    public static int[] moveZerosToEnd2(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {  // move non-zero elements to the front
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {  // Fill the remaining positions with zeros
            arr[index] = 0;
            index++;
        }
        return arr;
    }

    public static String findRepetitiveSubstring(String input) {
        int n = input.length();
        for (int len = 1; len <= n / 2; len++) {
            String candidate = input.substring(0, len);
            int repetitions = n / len;
            String repeatedCandidate = "";

            for (int i = 0; i < repetitions; i++) {
                repeatedCandidate += candidate;
            }
            if (repeatedCandidate.equals(input)) {
                return candidate;
            }
        }
        return "There is no repetitive substring";
    }

// ============================================================================================================================

public static void main(String[] args) {

    StringBuilder StrReversed = new StringBuilder("emoclew");    //* very cool thing!!!
        System.out.println(StrReversed.reverse());

    Random random = new Random();
        int randomNumber = random.nextInt(100);   // randomly printing numbers limited to 100
        System.out.println(randomNumber);

    isPanagram("abcdefgjhkilmnopqrstuvwxyz");


}

}
