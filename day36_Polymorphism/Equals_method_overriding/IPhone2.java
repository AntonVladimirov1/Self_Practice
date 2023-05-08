package day36_Polymorphism.Equals_method_overriding;

import java.util.Arrays;

public class IPhone2 {

    private String brand;
    private String model;
    private String size;
    private String color;
    private double price;

    public IPhone2(String brand, String model, String size, String color, double price) {
        setBrand(brand);
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
        String[]colors = {"Black","White","Silver","Gold","Pink","Gray","Blue"};
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

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IPhone2)){
            System.err.println("Invalid object");
        }
        if (obj instanceof IPhone2){
            if (model.equals(((IPhone2) obj).model)){  //* equal - is for string comparing. == - is for all others
                if (color.equals(((IPhone2) obj).color)){
                    return true;
                }
            }
        }
        return false;
    }
}
