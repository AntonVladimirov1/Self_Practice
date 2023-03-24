package day06_practice;

public class OverTimePay {
    public static void main(String[] args) {

        double hourlyRate = 50.0;
        int hoursWorked = 41;
        double netPay;
        String message;

        if (hoursWorked > 40) {
            int overTimeHours = hoursWorked - 40;
            netPay = hourlyRate * 40; //normal pay for 40 hours
            netPay += hourlyRate * 1.5 * overTimeHours; //rate for overtime = 1.5 times
            message = "Wow you worked " + hoursWorked + " so you will get " + overTimeHours + " hours extra pay\nYour net pay & " + netPay;
        } else { //worked less than 40 hours
            netPay = hourlyRate * hoursWorked;
            message = "You worked " + hoursWorked + " hours, so your total net pay is: $ " + netPay;
        }
        System.out.println("===============================================");
        System.out.println(message);
        System.out.println("===============================================");
    }
}
