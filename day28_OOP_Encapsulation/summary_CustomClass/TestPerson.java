package day28_OOP_Encapsulation.summary_CustomClass;

public class TestPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Masha");
        Person person2 = new Person("Katya",'M');
        Person person3 = new Person("Marina",21,'M');
        Person person4 = new Person("Olya",20,'M',"English");
        Person person5 = new Person("Karina",20,'M',"English");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

        Person.printPlanetName(); // static method calls through class name
        person1.drink("kaka"); // instance method calls through object name
        person2.eat("shit");

    }
}
