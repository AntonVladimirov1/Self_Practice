package day07_Finra;

public class LoanApplication {
    public static void main(String[] args) {

        int salary = 45000;
        int score = 700;
        String message;

        if (salary < 45000 || score < 700) {
            message = "Not eligible";
        } else {
            message = "Eligible";
        }
        System.out.println("=================");
        System.out.println(message);
        System.out.println("=================");
    }
}
