package day06_practice;

public class Net_Balance {
    public static void main(String[] args) {

        double Balance=100;
        double Withdraw=250;
        double newBalance= Balance-Withdraw;//new balance assign

        if (newBalance < 0){
            System.out.println("Your remaining balance = " + (newBalance-100)); // fixed Fee
        }else{
            System.out.println("Your remaining balance = " + newBalance);
        }
    }
}
