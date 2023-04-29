package day32_Final_Keyword.Method_Overriding;

public class Car {

    private String make,model,color;
    private int year;
    private double price;
    private static int numberOfWheels;
    private static boolean hasBattery;

    public Car(String model, String color, int year, double price) {
        setMake(getClass().getSimpleName());
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    static {
        numberOfWheels=4;
        hasBattery=true;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
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
    public void setYear(int year) {
        if (year<=0){
            System.err.println("Invalid year!");
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price<=0){
            System.out.println("Invalid negative price!");
        }
        this.price = price;
    }


    public void start(){
        System.out.println("Press the brake and twist the key to ignition to start "+make+" "+model);
    }

    @Override
    public String toString() {
        return make+"{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", wheels=" + numberOfWheels +
                '}';
    }
}
