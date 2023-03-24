package day16_NestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition =false;

        for (; condition ;){
            System.out.println("Hello");
        }
        System.out.println("===========================");

        while (condition){
            System.out.println("Hello");
        }
        System.out.println("===========================");

        do{
            System.out.println("Hello cydeo");
        }while (condition);

        System.out.println("============================");


    }
}
