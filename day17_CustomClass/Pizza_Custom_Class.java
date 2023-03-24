package day17_CustomClass;

public class Pizza_Custom_Class {

    public char size;
    public int cheeseTopping,pepperoniTopping;

    public double calcCost(){
        double totalPrice = 0;
        switch (size){
            case 'S': case's':
                totalPrice=10 + 2 *(cheeseTopping + pepperoniTopping);break;
            case 'M': case 'm':
                totalPrice=12 + 2 *(cheeseTopping + pepperoniTopping);break;
            case 'L': case 'l':
                totalPrice=14 + 2 *(cheeseTopping + pepperoniTopping);break;
            default:
                System.out.println("Invalid size: "+size);
        }

        return totalPrice;

    }

    public void setInfo(char size, int cheeseTopping,int pepperoniTopping){
        this.size=size;
        this.cheeseTopping=cheeseTopping;
        this.pepperoniTopping=pepperoniTopping;

    }


    public String toString() {
        return "Pizza: " +
                "\n size=" + size +
                ", CheeseTopping=" + cheeseTopping +
                ", PepperoniTopping=" + pepperoniTopping +
                ", Total price= "+ calcCost();
    }
}
