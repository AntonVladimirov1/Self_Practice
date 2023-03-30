package utilities;

public class ArrayString_FirstEqualLastCharacter {
    public static void main(String[] args) {

        String[] names = {"Anna", "Mike", "Aliya", "Remus", "Gina", "Hannah", "Nathan", "Otto", "Kevin", "Kelly"};
        int counter = 0; //initialise counter;
        for (String each : names) {
            if((each.charAt(0)+"").equalsIgnoreCase(each.charAt(each.length()-1)+"")){ // if first and last letters of string elements are ==
                counter++; // counter goes up 1;
            }
        }
        System.out.println(counter); //5

    }
}
