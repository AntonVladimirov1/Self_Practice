package day11_StringMethods;

public class Upper_Lower_case {
    public static void main(String[] args) {

        String first ="cy  DEo             ";
        String last ="sCh  OoL";

        // "c" - convert first char to upper case + remaining chars of the first name to lower case

        first =first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();

        last =last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        System.out.println(first.trim().replace(" ","") +" "+last.trim().replace(" ",""));
        // trim - to remove white spaces;   replace - to remove spaces between chars.


    }
}
