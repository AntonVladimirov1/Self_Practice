package day26_Statics;

import day27_AccessModifiers.Circle;

public class TestIPhone {
    public static void main(String[] args) {

        IPhone obj1 = new IPhone("IPhone12","Black",1000);
        obj1.printPhoneInfo();

        System.out.println("=========================================");

        Circle first =new Circle(5);
        System.out.println(first);
        Circle second =new Circle(7);
        System.out.println(second);

        System.out.println("Pi value = "+Circle.Pi);

    }
}
