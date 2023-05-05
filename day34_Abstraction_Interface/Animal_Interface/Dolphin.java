package day34_Abstraction_Interface.Animal_Interface;

public class Dolphin extends Animal implements Swimmable,Playable{

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating small fish");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" swimming better than other animals");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is always playing with humans");
    }
}
