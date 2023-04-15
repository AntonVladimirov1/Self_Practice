package Live_Sessions.VendingMashine;

import java.util.ArrayList;

public class DrinkVending {

    ArrayList<Drink> allDrinks;
    //DrinkVending machine = new DrinkVending();
    //machine.allDrinks.get(0).name

    public DrinkVending(){
        allDrinks=new ArrayList<>();
    }

    public DrinkVending(ArrayList<Drink> inputDrinks){
        this();                             // calls the no arg constructor
        allDrinks.addAll(inputDrinks);      // add all of Drinks objects from the inputDrinks into allDrinks ArrayList
    }

    public void stock(ArrayList<Drink> newDrinks){
    //outer:
        for (Drink each: newDrinks){
            for (Drink vending: allDrinks){
                if (vending.name.equalsIgnoreCase(each.name)){
                    vending.quantity+= each.quantity;
                    break; // continue outer;
                }
            }
            allDrinks.add(each);
        }
    }

    public double vend(String drink){
        for (Drink each: allDrinks){
            if (each.name.equalsIgnoreCase(drink)){
                if (each.quantity >0){
                    return each.price;
                }else {
                    System.out.println("Sorry "+drink+" is out of stock");
                    return 0;
                }
            }
        }
        System.out.println("Sorry "+drink+" not offered");
        return -1;
    }



    public String toString(){
        String output ="";
        for (Drink each: allDrinks){
            output+= each+"\n";
        }
        return output;
    }





}
