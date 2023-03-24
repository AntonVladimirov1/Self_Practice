package day17_CustomClass;

public class Employee_Custom_Class {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public  String id;

    public void setInfo (String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }

    public String toString() {
        return "Employee_Custom_Class{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }

    public void work(){
        System.out.println(name+" is working full time");
    }
    public void work2(){
        System.out.println(name+" is working part time");
    }
}

