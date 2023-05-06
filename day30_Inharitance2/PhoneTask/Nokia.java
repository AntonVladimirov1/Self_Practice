package day30_Inharitance2.PhoneTask;

public class Nokia extends Phone{

    public Nokia(String model, String size, String color, double price) {
        super(model, size, color, price);
    }

    public void selfDefense(){
        System.out.println(getBrand()+" "+getModel()+" can be used for self defense");
    }
}
