package day15_WhileLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 6){
                break;
            }
            System.out.print(i);
        }
        System.out.println();
        System.out.println("==========================");

        for (char i = 'A'; i <='Z'; i++) {

            System.out.print(i +" ");

            if (i == 'J')
                break;
        }
        System.out.println();
        System.out.println("==========================");

        for (;;){ // Infinite Loop
            System.out.println("Hello");
            break;
        }
    }
}
