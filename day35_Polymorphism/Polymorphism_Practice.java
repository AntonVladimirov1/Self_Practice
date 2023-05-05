package day35_Polymorphism;

import day34_Abstraction_Interface.Animal_Interface.Animal;
import day34_Abstraction_Interface.Animal_Interface.Tiger;

public class Polymorphism_Practice {
    public static void main(String[] args) {

        Animal tiger =new Tiger("Hook","Bengal",'M',7,"Big","Orange");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        //tiger.hunt();

    }
}
