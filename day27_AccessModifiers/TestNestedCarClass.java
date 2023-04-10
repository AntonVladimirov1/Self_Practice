package day27_AccessModifiers;

public class TestNestedCarClass {
    public static void main(String[] args) {

        Car_Nested first = new Car_Nested();      //* Car object (outer)
        first.new CarEngine();                 //* CarEngine object (inner)

        new Car_Nested.StaticInnerClass();  //* if class is Static can call strait through the outer class name


    }
}
