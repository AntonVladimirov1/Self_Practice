package day32_Final_Keyword.Car_Method_Overriding;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println("Press the start button to start "+getMake()+" "+getModel());
    }



}
