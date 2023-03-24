package day05_practice;

public class Salary_Before_Tax {
    public static void main(String[] args) {

             double hourlyRate = 65.5;
             int weeklyHours = 40;
             double stateTaxRate = 12.0;
             double federalTaxRate = 10.0;
             
             double salaryBeforeTax = hourlyRate * weeklyHours * 52;
             double stateTax = salaryBeforeTax * stateTaxRate/100;
             double federalTax = salaryBeforeTax * federalTaxRate/100;
        System.out.println();
        System.out.println("SalaryBeforeTax = " + salaryBeforeTax + " $");
        System.out.println("----------------------------");
             double salaryAfterTax = salaryBeforeTax - federalTax - stateTax;
        System.out.println("SalaryAfterTax = " + salaryAfterTax + " $");

    }
}
