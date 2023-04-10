package day27_AccessModifiers;

public class StaticBlockInitialization {

    public static int a;
    public static double b;
    public static String c;

    static {            //* this Static initialization block executed automatically when class called

        a = 100;
        b = 20.5;
        c = "Java";
    }

   /* public StaticBlockInitialization(){
        a = 100;
        b = 20.5;
        c = "Java";
    } */

}
