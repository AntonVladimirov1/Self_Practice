package day34_Abstraction_Interface.Car;

public class TestCars {
    public static void main(String[] args) {

        Honda honda=new Honda("Civic","Blue",1981,25_000);
        System.out.println(honda);
        Audi audi=new Audi("Q7","white",2020,30_000);
        System.out.println(audi);
        Tesla tesla=new Tesla("X","Black",2023,100_000);
        System.out.println(tesla);

        tesla.start();
        tesla.autoPilot();
        tesla.stop();

    }
}
