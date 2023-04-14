package day24_Date_and_Time;

import java.time.LocalDate;

public class Person_CustomMethod {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;

    public void setInfo (String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
