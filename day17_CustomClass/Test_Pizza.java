package day17_CustomClass;

public class Test_Pizza {
    public static void main(String[] args) {

       Pizza_Custom_Class pizza1 = new Pizza_Custom_Class();
         pizza1.setInfo('S',1,2);

        Pizza_Custom_Class pizza2 = new Pizza_Custom_Class();
         pizza2.setInfo('M',2,3);

        Pizza_Custom_Class pizza3 = new Pizza_Custom_Class();
        pizza3.setInfo('L',3,4);


        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        System.out.println("=======================================================");

        double total = 0;

        for (int i = 0; i < 20; i++) {
            Pizza_Custom_Class small = new Pizza_Custom_Class();
            small.setInfo('s',1,2);
            total += small.calcCost();

            Pizza_Custom_Class medium = new Pizza_Custom_Class();
            medium.setInfo('m',2,3);
            total += medium.calcCost();

            Pizza_Custom_Class large = new Pizza_Custom_Class();
            large.setInfo('l',3,4);
            total += large.calcCost();
        }

        System.out.println("Total= "+total);

    }
}
