package day26_Statics;

public class ConstructorCalls2 {

    public ConstructorCalls2(){

        System.out.println("Default");
    }

    public ConstructorCalls2(int a){
        this();                        //* calling Default constructor
        System.out.println("Int arg");
    }

    public ConstructorCalls2(String a){
        this(10);
        System.out.println("String arg");
    }

    public static void main(String[] args) {
        ConstructorCalls2 obj1 = new ConstructorCalls2();
        System.out.println("======================================================");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10);
        System.out.println("======================================================");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Java");

    }


}
