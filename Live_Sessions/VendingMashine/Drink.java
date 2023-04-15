package Live_Sessions.VendingMashine;

public class Drink {

    String name;
    double price;
    int quantity;

    public Drink(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String toString(){
        return name+" | $"+price+" | Total quantity "+quantity;
    }



}
