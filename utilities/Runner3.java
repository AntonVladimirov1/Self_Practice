package utilities;


import day34_Abstraction_Interface.Animal_Interface.Dolphin;
import day34_Abstraction_Interface.Animal_Interface.Person;

public class Runner3 {
       public static void main(String[] args) {
              Person person=new Person();
              System.out.println(person);
              person.play();
              person.swim();

              Dolphin dolphin=new Dolphin("Sunny","White",'M',5,"big","Grey");
              System.out.println(dolphin);
              dolphin.play();
              dolphin.eat();
              dolphin.swim();
       }
}


