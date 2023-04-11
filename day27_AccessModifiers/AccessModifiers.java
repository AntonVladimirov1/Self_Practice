package day27_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 200;          //* Public - most visible modifier
    protected static int protectedData = 250;    //* Protected - not always visible in another Package
    static int defaultData = 300;                //* Default - never visible in another Package
    private static int privateData = 350;        //* Private - visible only in this Class


    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(protectedData);
        System.out.println(defaultData);
        System.out.println(privateData);
    }

}
