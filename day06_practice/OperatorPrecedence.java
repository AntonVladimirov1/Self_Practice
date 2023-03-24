package day06_practice;

public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println((5+2)*3);
        System.out.println(-5 + 6);

        System.out.println(10>9 == 8<7 && "boy" =="girl"|| "girl" == "girl");

        System.out.println("------------------------------------------------");

        //Assignments vvv - means - variable "number +-* =" for witch will be calculated after =
        int a = 20;
        a += 10 + 2 * 3;     //a += 16 ===> a = 36

        System.out.println(a);
    }
}
