package day16_NestedLoop;

public class Nested_ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Nado");
        }
        System.out.println("==============================");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Nado");
            }
        }

    }
}
