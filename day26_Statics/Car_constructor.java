package day26_Statics;

public class Car_constructor {

    String make,model;
    int year;
    double price;
    String color;

    public Car_constructor(String make) {
        this.make = make;
    }

    public Car_constructor(String make, String model) {
        this(make);
        this.model = model;
    }

    public Car_constructor(String make, String model, int year) {
        this(make, model);
        this.year = year;
    }

    public Car_constructor(String make, String model, int year, double price) {
        this(make, model, year);
        this.price = price;
    }

    public Car_constructor(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String toString() {
        return "\nCar_constructor{" +
                "make= '" + make + '\'' +
                ", model= '" + model + '\'' +
                ", year= " + year +
                ", price= " + price +
                ", color= '" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Car_constructor car1 = new Car_constructor("Lexus","Super",2023,70_000,"White");
        System.out.println(car1);

    }
}
