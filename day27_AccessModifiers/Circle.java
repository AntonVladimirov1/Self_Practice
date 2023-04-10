package day27_AccessModifiers;

public class Circle {

    double radius;
    double diameter;
    public static double Pi= 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2;
    }

    public double area(){
        return (radius*radius*Pi);
    }
    public double perimeter(){
        return (diameter*Pi);
    }

    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", diameter = " + diameter +
                ", Perimeter = " + perimeter() +
                ", Area = " + area() +
                '}';
    }
}
