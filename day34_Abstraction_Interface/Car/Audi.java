package day34_Abstraction_Interface.Car;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
    public void start(){
        System.out.println("Push start button "+getModel());
    }
    public void autoPark(){
        System.out.println("Choose the auto park option of the "+getModel());
    }
}
