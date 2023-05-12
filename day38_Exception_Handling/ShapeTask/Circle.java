package day38_Exception_Handling.ShapeTask;

public class Circle {

    private double Radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            throw new InvalidShapeException("Invalid '0' or negative Radius");
        }
        Radius = radius;
    }
}
