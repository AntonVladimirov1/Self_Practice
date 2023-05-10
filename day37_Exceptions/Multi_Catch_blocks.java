package day37_Exceptions;

import day35_Polymorphism.Transport.Car;

public class Multi_Catch_blocks {
    public static void main(String[] args) {

        System.out.println("Start");
        Car car = null;
        try {
            car.drive();
        }catch (ArithmeticException e){
            System.out.println("first catch");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("second catch");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("third catch");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("forth catch");
            e.printStackTrace();
        }catch (RuntimeException e){          // this is parent of exceptions, most popular type
            System.out.println("fifth catch");
            e.printStackTrace();
        }
        System.out.println("end");



    }
}
