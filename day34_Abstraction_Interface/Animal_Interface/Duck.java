package day34_Abstraction_Interface.Animal_Interface;

public class Duck extends Animal implements Playable,Flyable,Swimmable{

    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+getName()+" is eating bread");
    }

    @Override
    public void play() {
        System.out.println("Duck "+getName()+" playing with fish");
    }

    @Override
    public void fly() {
        System.out.println("Duck "+getName()+" flying everywhere");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" swimming on surface");
    }
}
