package day26_Statics;

public class IPhone {

    public static String brand= "Apple";
    String  model,color;
    double price;
    public static String OS= "IOS";
    public static String madeIn="China";

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    public void printPhoneInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Price; "+price);
        System.out.println("OS: "+OS);
        System.out.println("Made in: "+madeIn);
    }



}
