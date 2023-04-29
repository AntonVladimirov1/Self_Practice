package day32_Final_Keyword.Car_Method_Overriding;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void autoPilot(){
        System.out.println(getMake()+" "+getModel()+" is in self-driving mode");
    }
    @Override
    public void start(){
        System.out.println("Say \"Start\" to start "+getMake()+" "+getModel());
    }

    @Override
    public void setModel(String model) {
        ArrayList<String> models = new ArrayList<>(Arrays.asList("Model S","Model Y","Model X","Model 3"));
        //String[] models = {"Model S","Model Y","Model X","Model 3"}; - can do that way.
        if (!models.contains(model)){
            System.err.println("Invalid Model: "+model);
        }
        super.setModel(model);
    }

    @Override
    public void setColor(String color) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("White","Black","Red","Blue"));
        //String[] colors = {"White","Black","Red","Blue"}; - can do that way.
        if (!colors.contains(color)){
            System.err.println("Invalid Tesla color");
        }

        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if (year<2008){
            System.err.println("Invalid Tesla year");
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {
        if (price<50_000){
            System.err.println("Invalid Tesla price");
        }
        super.setPrice(price);
    }
}
