package utilities;

public class StringSumOfDigits {

    public static int sumOfDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                sum += digit;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("a5jh2mnb8ge5"));
    }

}
