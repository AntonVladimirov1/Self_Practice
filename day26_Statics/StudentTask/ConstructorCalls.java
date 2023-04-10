package day26_Statics.StudentTask;

public class ConstructorCalls {

    public ConstructorCalls(){
        //*this();  Costructor cannot call or contain itself
        System.out.println("Default constructor");
    }
    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int arg");
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double arg");
    }
    public ConstructorCalls(String c){
        this(2.5);
        //*this();  // Constructor can call only ONE other Constructor
        System.out.println("Constructor with String arg");
    }


    public static void main(String[] args) {
    }
       public static void method1(){
           //ConstructorCalls();
           //this();
           System.out.println("Method 1");
       }
       public static void method2(){
        method1();
           System.out.println("Method 2");
       }


}
