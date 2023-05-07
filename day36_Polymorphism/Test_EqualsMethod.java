package day36_Polymorphism;

public class Test_EqualsMethod {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(15);

        System.out.println(circle1.equals(circle2)); // true
        System.out.println(circle1 == circle2); // always false
        System.out.println(circle1.equals(circle3)); // false

    }
}
