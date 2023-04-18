package day29_Inheritance.Animal;

public class TestZoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Koko","Husky",'M',4,"Large","White");
        dog.eat();
        dog.drink();
        dog.sleep();

        Cat cat = new Cat();
        cat.setInfo("Gigi","jyhfg",'M',5,"uyf","uygfyu");
        cat.eat();
        cat.drink();
        cat.sleep();

        Tiger tiger = new Tiger();
        tiger.setInfo("King","jyhgjh",'F',8,"hjgjh","jhgjh");
        tiger.eat();
        tiger.drink();
        tiger.sleep();

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);
        System.out.println("========================================================");

        dog.bark();
        cat.meow();
        tiger.hunt();
        System.out.println("========================================================");


    }
}
