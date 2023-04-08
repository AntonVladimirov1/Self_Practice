package day25_Constructor;

import java.time.LocalDate;

public class Employee_CustomClass {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hired_Date;

    public Employee_CustomClass(String name, int age, char gender, String jobTitle, double salary, LocalDate hired_Date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hired_Date = hired_Date;
    }

    public String toString() {
        return "Employee_CustomClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hired_Date=" + hired_Date +
                '}';
    }
}
