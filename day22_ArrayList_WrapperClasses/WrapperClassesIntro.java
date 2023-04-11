package day22_ArrayList_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        int num = 654;
        Integer numbers = num;  //wrapping exactly the same primitive variable - auto boxing
        System.out.println("=============================");
        Integer bob = 45;
        int coc = bob;  // unboxing
        System.out.println(bob);

    }
}
