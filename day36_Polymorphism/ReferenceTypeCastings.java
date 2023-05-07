package day36_Polymorphism;

import day29_Inheritance.Animal.Animal;
import day29_Inheritance.Animal.Dog;
import day30_Inharitance2.PhoneTask.IPhone;
import day30_Inharitance2.PhoneTask.Nokia;
import day30_Inharitance2.PhoneTask.Phone;
import day33_Abstraction.Employee_Task.Developer;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Animal animal = new Dog();
        System.out.println("=================================");

        Animal animal1 = new Dog();
       // animal1.setInfo("Koko","Husky",'M',4,"Large","White");

        animal1.eat();
        animal1.sleep();
        animal1.drink();
        ((Dog)animal1).bark(); // can downcast animal to dog for just one method

       // Dog dog1 = (Dog) animal1; // or can downcast whole animal object to get everything from there
        // dog1.bark();

        //((Cat)animal1).scratch();  // animal1 refer to the Dog object created on line 16, so cannot be referred to the Cat
        System.out.println("==================================================");

        Phone phone= new Nokia("XR20", "Small", "Blue", 350);
        Phone phone1= new IPhone("kjhkjh", "gg","Black" , 654456);

        phone.call(911);
        phone.text(911);
        ((Nokia) phone).selfDefense(); // reference object created - line on 30

        ((IPhone)phone1).faceTime(911); // reference object created - line on 31
        System.out.println("==================================================");

        Developer employee= new Developer("Bobby",29,'M',"12AB","Developer",150_000,"Java");

        employee.work();
        System.out.println(employee.getProgrammingLanguage());


    }
}
