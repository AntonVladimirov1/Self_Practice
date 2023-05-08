package day36_Polymorphism.Equals_method_overriding;

import day36_Polymorphism.Equals_method_overriding.Circle;
import day36_Polymorphism.Equals_method_overriding.IPhone2;

public class Test_EqualsMethod {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(15);

        System.out.println(circle1.equals(circle2)); // true
        System.out.println(circle1 == circle2); // always false
        System.out.println(circle1.equals(circle3)); // false
        System.out.println("===============================================");

        IPhone2 iPhone1 = new IPhone2("Apple","12","medium","Black",900);
        IPhone2 iPhone2 = new IPhone2("Apple","12","medium","Blue",900);
        IPhone2 iPhone3 = new IPhone2("Apple","12","medium","Black",900);

        //System.out.println(iPhone1.equals(circle1));
        System.out.println(iPhone1.equals(iPhone2));  //* equal - is for string comparing. == - is for all others
        System.out.println(iPhone1.equals(iPhone3));


    }
}
