package day34_Abstraction_Interface.Animal_Interface;

public class Airplane implements Flyable{
    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" can fly very high");
    }
}
