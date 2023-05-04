package day34_Abstraction_Interface.Animal_Interface;

public class Parrot extends Animal implements Flyable,Playable{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Parrot "+getName()+" is eating seeds");
    }

    @Override
    public void fly() {
        System.out.println("Parrot "+getName()+" can fly");
    }

    @Override
    public void play() {
        System.out.println("Parrot "+getName()+" playing very funny");
    }
}
