package utilities;

public class ContainElement_inArray {

    public static boolean contains(int[] array, int element){

        for (int each : array) {
            if (each == element){
                return true;
            }
        }
        return false;
    }
    public static boolean contains(double[] array, double element){

        for (double each : array) {
            if (each == element){
                return true;
            }
        }
        return false;
    }
    public static boolean contains(char[] array, char element){

        for (char each : array) {
            if (each == element){
                return true;
            }
        }
        return false;
    }
    public static boolean contains(String[] array, String element) {

        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
