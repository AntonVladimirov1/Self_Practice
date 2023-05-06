package day36_Polymorphism;


import day30_Inharitance2.PhoneTask.*;


public class Polymorphism_Practice3 {
    public static void main(String[] args) {


        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Smalle", "Gold", 400),
                new IPhone("Iphone 11", "Smalle", "White", 500)
        };
        for (Phone each : phones) {
            System.out.println(each.getModel()+" - "+each.getColor()+" - "+each.getPrice());
        }
        System.out.println("======================================================");
        int countIPhone = 0,countSamsung =0,countNokia =0;
        for (Phone each : phones) {
            if (each instanceof IPhone){
                countIPhone++;
            }
            if (each instanceof Samsung){
                countSamsung++;
            }
            if (each instanceof Nokia){
                countNokia++;
            }
        }
        System.out.println("IPhones = "+countIPhone+"\nSamsung = "+countSamsung+"\nNokia = "+countNokia);
        System.out.println("==========================================================");

        for (Phone each : phones) {
            if (each instanceof IPhone || each instanceof Samsung){
                if (each.getPrice() >= 700){
                    System.out.println(each.getModel());
                }
            }
        }

    }
}
