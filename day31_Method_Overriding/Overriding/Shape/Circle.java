package day31_Method_Overriding.Overriding.Shape;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    @Override
    public double perimeter() {
        return (2*Math.PI)*radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println();
        System.out.println("       **");
        System.out.println("    *      *");
        System.out.println("  *          *");
        System.out.println("    *      *");
        System.out.println("       **");
    }
}
