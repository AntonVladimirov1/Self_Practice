package day32_Final_Keyword.Person_Task;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dateOfBirth;

    public static final int numberOfHead;
    static {
        numberOfHead=1;
    }

    public Person(String name, char gender, int age, LocalDate dateOfBirth) {
        setName(name);
        if(!(gender == 'M' || gender == 'F')){
            System.out.println("Invalid gender: "+gender);
        }
        this.gender = gender;
        if(age<=0){
            System.out.println("Invalid age: "+age);
        }
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public final void breath(){
        System.out.println(name+" is breathing");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
