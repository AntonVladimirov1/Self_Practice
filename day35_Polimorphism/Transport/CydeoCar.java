package day35_Polimorphism.Transport;

import day34_Abstraction_Interface.Animal_Interface.Flyable;
import day34_Abstraction_Interface.Animal_Interface.Swimmable;

public class CydeoCar extends Car implements Flyable,Electric,AutoPilot, Swimmable {

    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void start() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }
}
