package day06_practice;

public class NetIncomeCalc_Practice {
    public static void main(String[] args) {

        double salary = 70_000;
        boolean isMarried = true;
        double taxRate = 0;


        if (salary>= 130000){
            taxRate= 0.35;
        } if (salary>=100000 && salary<130000) {
            taxRate=0.30;
        } if (salary>=80000 && salary<100000) {
            taxRate=0.25;
        } if (salary<80000) {
            taxRate=0.20;
        } if (isMarried) {
            taxRate -=0.05;
        }
        double salaryAfterTax = salary-(salary*taxRate); //or can apply =salary * (1-taxRate)

        System.out.println("===================================");
        System.out.println("Salary after Tax = "+ salaryAfterTax);
        System.out.println("===================================");


    }
}
