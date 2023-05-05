package day35_Polimorphism.Transport;

public abstract class Transportation {

    private final String make,model;
    private String color;
    private final int year;
    private double price;

    public Transportation(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);
        if (year<2000){
            System.err.println("Very old car! (be aware)");
        }
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Invalid price");
        }
        this.price = price;
    }

    public abstract void start();

    public abstract void transportPeople();

    public void stop(){
        System.out.println("Shut off the engine");
    }

    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "make ='" + make + '\'' +
                ", model ='" + model + '\'' +
                ", color ='" + color + '\'' +
                ", year =" + year +
                ", price =" + price +
                '}';
    }
}
