package day06_practice;

public class Net_Balance_2 {
    public static void main(String[] args) {

        double Balance=100;
        double Withdraw=250;
        double newBalance= Balance-Withdraw;// newBalance -= Withdraw (same thing)

        if (newBalance< 0){
            newBalance -=100;} //or flexible Fee: if we want to apply fee in % of remaining balance = (newBalance +=newBalance * %)

        System.out.println("Your remaining balance = " + newBalance);

    }
}
