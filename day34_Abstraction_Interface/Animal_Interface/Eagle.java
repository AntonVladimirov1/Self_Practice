package day34_Abstraction_Interface.Animal_Interface;

public class Eagle extends Animal implements Flyable,WildAnimal{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+getName()+" eats snake");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying high");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting snakes");
    }
}
