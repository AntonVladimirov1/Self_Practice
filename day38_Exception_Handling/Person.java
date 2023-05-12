package day38_Exception_Handling;

import java.util.InputMismatchException;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if (!(gender =='M'|| gender =='F')){
            throw new InputMismatchException("Invalid gender entered");
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age == 0){
            throw new InputMismatchException("Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if (age<0 || age>150){
            throw new InputMismatchException("Invalid age entered!!!");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name ='" + name + '\'' +
                ", age =" + age +
                ", gender =" + gender +
                '}';
    }
}
