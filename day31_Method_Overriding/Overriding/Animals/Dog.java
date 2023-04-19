package day31_Method_Overriding.Overriding.Animals;

public class Dog extends Animals {

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    @Override
    public void drink() {
        System.out.println(getName()+" is drinking beer");
    }
    @Override
    public void eat() {
        System.out.println(getName()+" is eating cats");
    }
    @Override
    public void sleep() {
        System.out.println(getName()+" never sleeps");
    }
}
