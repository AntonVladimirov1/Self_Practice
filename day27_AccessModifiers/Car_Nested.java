package day27_AccessModifiers;

public class Car_Nested {     //* Outer class

    String make,model,color;
    int year;
    double price;

    public static int wheels = 4;

    public class CarEngine {   //* inner class - //accept only instance variables
        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }

    }
               //* Static class can be only Inner class
    public static class StaticInnerClass{
        public void method(){  //accepts only static members
            System.out.println(wheels);
        }
    }

}
