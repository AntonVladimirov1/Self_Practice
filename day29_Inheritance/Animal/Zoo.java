package day29_Inheritance.Animal;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Ghjgj","Husky",'M',4,"Large","White");

        Cat cat = new Cat();
        cat.setInfo("kjgh","jyhfg",'M',5,"uyf","uygfyu");

        Tiger tiger = new Tiger();
        tiger.setInfo("jhgj","jyhgjh",'F',8,"hjgjh","jhgjh");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);


    }
}
