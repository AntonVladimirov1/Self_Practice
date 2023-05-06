package day30_Inharitance2.PhoneTask;

public class Samsung extends Phone{


    public Samsung(String model, String size, String color, double price) {
        super(model, size, color, price);
    }

    public void freeze(){
        System.out.println(getBrand()+" "+getModel()+" freeze a lot");
    }


}
