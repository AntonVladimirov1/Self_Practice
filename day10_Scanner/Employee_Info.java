package day10_Scanner;

import java.util.Scanner;

public class Employee_Info {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName=input.nextLine();
        System.out.println("Enter your age:");
        String age=input.nextLine();
        System.out.println("Enter your gender:");
        char gender=input.next().charAt(0);
        input.nextLine();
        System.out.println("Enter your company name:");
        String company=input.nextLine();
        System.out.println("Enter your job title:");
        String job_title= input.nextLine();
        System.out.println("Enter your salary:");
        double salary= input.nextDouble();


        System.out.println("Your employee information:\n"+fullName+"\n"+age+"\n"+gender+"\n"+company+"\n"+job_title+"\n$"+salary);
        input.close();
    }
}
