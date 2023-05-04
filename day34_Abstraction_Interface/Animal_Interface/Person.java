package day34_Abstraction_Interface.Animal_Interface;

public class Person implements Swimmable,Playable{

    @Override
    public void play() {
        System.out.println(getClass().getSimpleName()+" can play with anybody");
    }

    @Override
    public void swim() {
        System.out.println(getClass().getSimpleName()+" can swim funny");
    }
}
