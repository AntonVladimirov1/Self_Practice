package day32_Final_Keyword.Method_Overriding;

public class TestCar {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry","Red",2020,25000);
        Honda honda = new Honda("Odyssey","Green",2022,35000);
        Audi audi = new Audi("Q7","Silver",2021,45000);
        BMW bmw = new BMW("X6","Black",2023,55000);
        Tesla tesla = new Tesla("Model X","White",2022,65000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);
        System.out.println("=======================================================================");

        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();
        tesla.autoPilot();
        System.out.println("=======================================================================");

        tesla.setPrice(45000); // incorrect price
        tesla.setModel("Model H"); // incorrect model

    }
}
