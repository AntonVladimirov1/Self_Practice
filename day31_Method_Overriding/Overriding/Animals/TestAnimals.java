package day31_Method_Overriding.Overriding.Animals;

public class TestAnimals {
    public static void main(String[] args) {

        Cat cat=new Cat("Koshka","Bejhf",'F',4,"small","grey");
        System.out.println(cat);

        Dog dog=new Dog("Sobaka","Bejhf",'F',4,"small","grey");
        System.out.println(dog);

        Lion_toStringOverride lion=new Lion_toStringOverride("Lev","Bejhf",'F',4,"small","grey",true);
        System.out.println(lion);

        cat.eat();
        cat.sleep();
        dog.sleep();
        lion.sleep();

    }
}
