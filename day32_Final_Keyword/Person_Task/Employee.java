package day32_Final_Keyword.Person_Task;

import java.time.LocalDate;

public class Employee extends Person{

    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, int age, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, age, dateOfBirth);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+ " is working");
    }

}
