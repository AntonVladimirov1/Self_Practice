package day30_Inharitance2.typeOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {

    private String name;
    private  int age;
    private char gender;
    private LocalDateTime DOB;

    public Person(String name, char gender, LocalDateTime DOB) {
        setName(name);
        setGender(gender);
        setDOB(DOB);
        setAge(LocalDate.now().getYear() - DOB.getYear());
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age<=0){
            System.err.println("Invalid age");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDateTime getDOB() {
        return DOB;
    }
    public void setDOB(LocalDateTime DOB) {
        this.DOB = DOB;
    }

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';
    }
}
