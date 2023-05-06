package day35_Polymorphism;

import day31_Method_Overriding.Overriding.Shape.Circle;
import day33_Abstraction.Employee_Task.*;
import day34_Abstraction_Interface.Animal_Interface.*;
import day34_Abstraction_Interface.Car.Audi;
import day34_Abstraction_Interface.Car.Honda;
import day34_Abstraction_Interface.Car.Tesla;

import java.util.Arrays;

public class Polymorphism_Intro {                // Relation - Parent reference to Child
    public static void main(String[] args) {

        Dog dog = new Dog("Max","Husky",'M',5,"Big","White");
        Cat cat = new Cat("Max","Husky",'M',5,"Big","White");
        Tiger tiger = null;
        Lion lion = null;
        Eagle eagle = null;
        Parrot parrot = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck = null;

       // Animal[] animals = {dog,cat,tiger,lion,eagle,parrot,dolphin,shark,duck};

        Animal animal = new Dog("Max","Husky",'M',5,"Big","White");
        System.out.println(dog);
        animal.eat();
        animal.drink();
        animal.sleep();
        System.out.println("========================================================");

        String str = "Java";
        Integer n = 100;
        Boolean r = true;
        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda=new Honda("Civic","Blue",1981,25_000);
        Audi audi=new Audi("Q7","white",2020,30_000);
        Tesla tesla=new Tesla("X","Black",2023,100_000);

        Developer developer=new Developer("Bobby",29,'M',"12AB","Developer",150_000,"Java");
        Teacher teacher=new Teacher("Kukushka",45,'F',"45AB","math guru",80_000);
        Driver driver=new Driver("Ninja",34,'M',"AB15","car guru",95_000);
        Tester tester=new Tester("Yuki",23,'F',"AB78","tester",85_000);

        Object[] objects = {str, n, r, d, circle, honda, audi, tesla,developer, teacher, driver, tester};
        System.out.println(Arrays.toString(objects));

        Object[] employees = {developer,teacher,driver,tester};
        Employee obj = new Teacher("Kukushka",45,'F',"45AB","math guru",80_000);
        obj.work();
        System.out.println("===============================================================================");


    }

}
