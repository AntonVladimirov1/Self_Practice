package day25_Constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person_CustomClass {

    public String name;
    public int age;
    public char gender;
    public LocalDate DOB;
    public String isMarried;
    public String isEmployed;

    public Person_CustomClass(String name, int age, char gender, LocalDate DOB, String isMarried, String isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    public String toString() {
        return "Person_CustomClass{" +
                "name ='" + name + '\'' +
                ", age =" + age +
                ", gender =" + gender +
                ", DOB - " + DOB.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                ", isMarried ='" + isMarried + '\'' +
                ", isEmployed ='" + isEmployed + '\'' +
                '}';
    }
}
