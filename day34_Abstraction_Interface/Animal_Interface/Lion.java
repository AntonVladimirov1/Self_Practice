package day34_Abstraction_Interface.Animal_Interface;

public class Lion extends Animal implements WildAnimal{

    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating wild animals");
    }


    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting everything");
    }
}
