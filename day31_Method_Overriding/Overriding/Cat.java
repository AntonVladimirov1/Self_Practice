package day31_Method_Overriding.Overriding;

public class Cat extends Animals{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    @Override
    public void drink(){
        System.out.println(getName()+" is drinking milk");
    }
    @Override
    public void eat(){
        System.out.println(getName()+" is eating fish");
    }
    @Override
    public void sleep() {
        System.out.println(getName()+" always sleeps");
    }
}
