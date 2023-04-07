package day25_Constructor;

public class Rectangle_CustomClass {

    public double length, width;

    public void setInfo(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }

    public String toString() {
        return "Rectangle_CustomClass{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
