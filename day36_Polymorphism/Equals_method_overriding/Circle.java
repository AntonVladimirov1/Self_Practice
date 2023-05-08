package day36_Polymorphism.Equals_method_overriding;

public class Circle {

    private double radius;
    public final static double PI = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius * radius * PI;
    }

    public double perimeter(){
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius =" + radius +
                ", area =" + area() +
                ", perimeter =" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) { // if the specified object is not a Circle, then it won't compare it
            System.err.println("Invalid Object");
        }
        if (radius == ((Circle)obj).radius) { // if the current circle radius is equal to the given circle radius, then two circles are equal.
            return true;
        }
        return false;
    }
}
