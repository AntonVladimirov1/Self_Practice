package utilities;

public class Palindrome { // anna, racecar - can be read the same from begin and from end

    public static boolean isPalindrome(String str){

        for (int begin = 0,end = str.length()-1; begin <str.length()/2 ; begin++, end--) {
            if (str.charAt(begin) != str.charAt(end)){
                return false;
            }
        }
        return true;
    }

}
