package day35_Polymorphism;

import day34_Abstraction_Interface.Animal_Interface.*;
import day35_Polymorphism.Transport.*;

public class Polymorphism_Practice {
    public static void main(String[] args) {

        Animal tiger =new Tiger("Hook","Bengal",'M',7,"Big","Orange");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        //tiger.hunt();

        Animal animal= new Eagle("Vasya","jhgfh",'O',4,"jhghj","jhgj");
        //animal.fly();
        animal.sleep();
        animal.drink();
        animal.eat();

        Flyable obj1=new Eagle("Vasya","jhgfh",'O',4,"jhghj","jhgj");
        //obj1.eat();
        obj1.fly();
        System.out.println("Can eagle fly - "+obj1.canFly);

        Eagle eagle=null;
        Parrot parrot=null;
        Duck duck=null;
        Dolphin dolphin=null;
        Shark shark=null;
        Dog dog=new Dog("jhj","jhjk",'H',54,"juyh","jhfg");
        Cat cat=null;
        CydeoCar cydeoCar=null;
                                           //v v v - it's not a bird
        Flyable[] birds= {eagle,parrot,duck,cydeoCar};
        Swimmable[] fishes= {dolphin,shark,duck,cydeoCar};
        Playable[] friends= {dolphin,dog,cat,duck};

        boolean isAnimal = dog instanceof Animal;
        System.out.println(isAnimal);
        System.out.println("===========================================================================");

        Car car= new Tesla("Tesla","X","white",2020,85000);
        boolean isTesla = car instanceof Tesla;
        System.out.println(isTesla);

        boolean isElectric = car instanceof Electric;
        System.out.println(isElectric);

        boolean hasAutoPark = car instanceof AutoPark;
        System.out.println(hasAutoPark);



    }
}
