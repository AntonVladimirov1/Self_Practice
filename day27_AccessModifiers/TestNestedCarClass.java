package day27_AccessModifiers;

public class TestNestedCarClass {
    public static void main(String[] args) {

        Car_Nested first = new Car_Nested();      //* Car object
        first.new CarEngine();                 //* CarEngine object

        new Car_Nested.StaticInnerClass();


    }
}
