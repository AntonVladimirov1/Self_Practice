package day13_ReturnMethods;

public class ReturnStatement {
    public static void main(String[] args) {

        eligible(20);
        System.out.println("=====================");
        System.out.println(mult(2, 3));
        System.out.println("=====================");
        System.out.println("Hello");
        boolean exit =true;
        if (exit){
            return; // it only affects to Method (closing it)

        }

    }

        public static void eligible ( int age){
            if (age < 0 || age > 150) {
                System.out.println(age + " is invalid age");
                return; // exits the method
                // if the age is invalid, then the method gets terminated
            }
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        }
        public static int mult ( int n1, int n2){
            int result = n1 * n2;
            return result;
        }


}
