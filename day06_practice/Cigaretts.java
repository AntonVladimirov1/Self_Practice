package day06_practice;

public class Cigaretts {
    public static void main(String[] args) {

        int age = 27;

        if(age >= 21 && age<100){
            System.out.println("eligible");
        }
        if(age <21 || age >= 100){
            System.out.println("not eligible");
        }

    }
}
