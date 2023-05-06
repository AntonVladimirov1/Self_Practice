package day30_Inharitance2.PhoneTask;

import java.util.Arrays;

public class Phone {
    
    private String brand;
    private String model;
    private String size;
    private String color;
    private double price;


    public Phone(String model, String size, String color, double price) {
        setBrand(getClass().getSimpleName());
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);

    }

    public void call(long phoneNumber){
        System.out.println(getModel()+" is calling "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(getModel()+" is texting "+phoneNumber);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Price cannot be 0 or less");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[]colors = {"Black","White","Silver","Gold","Pink"};
        if (Arrays.asList(colors).contains(color)){
            this.color = color;
        }else {
            System.err.println("Invalid color.\nAvailable colors: "+Arrays.toString(colors));
        }

    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                " brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", size = '" + size + '\'' +
                ", price = " + price +
                ", color = '" + color + '\'' +
                '}';
    }
}
