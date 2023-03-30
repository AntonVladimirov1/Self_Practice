package day22_ArrayList_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20"; // need to convert to int
        System.out.println(str +1);
        System.out.println("=======================");

                                      // parse Method - returns primitive type, coverts String to primitive values
        // Integer num1 = Integer.parseInt(str); // unboxing
        int num = Integer.parseInt(str);
        System.out.println(num +1);
        System.out.println("=======================");
                                     // valueOf Method - returns wrapper class objects, converts String to wrapper class values
        Integer num2 = Integer.valueOf(str);
        System.out.println(num2+1);
        System.out.println("=======================");

        String s = "20.5";             // example
        double num3 = Double.parseDouble(s);
        Double num4 = Double.valueOf(s);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println("===============================");

        char ch = '!';                // new methods to check if the Char is Digit or Letter
        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isSpecChar = !Character.isLetterOrDigit(ch);
        boolean isLowerCase = Character.isLowerCase(ch);
        boolean isUpperCase = Character.isUpperCase(ch);
        System.out.println("Digit - "+isDigit);
        System.out.println("Letter - "+isLetter);
        System.out.println("SpecChar - "+isSpecChar);
        System.out.println("LowerCase - "+isLowerCase);
        System.out.println("UpperCase - "+isUpperCase);
        System.out.println("================================");

        String string = "a1b2t7s2r7"; // find sum of the digits in this String
        int sum = 0;
        for (char each : string.toCharArray()) {  // needs to wrap to array
            if (Character.isDigit(each)){  // determine digits only
               sum+= Integer.parseInt(""+each); // convert into Int and assign to sum variable
            }
        }
        System.out.println(sum);




    }
}
