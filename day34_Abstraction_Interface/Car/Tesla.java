package day34_Abstraction_Interface.Car;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
    public void start(){
        System.out.println("Use voice control to start "+getMake()+" model "+getModel());
    }
    public void autoPilot(){
        System.out.println("Choose auto pilot option of the model "+getModel());
    }
}
