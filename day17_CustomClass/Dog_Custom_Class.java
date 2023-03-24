package day17_CustomClass;

public class Dog_Custom_Class {

    public String name;  //  instance variable
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    public void setInfo(String name, String breed, String size, char gender, int age, String color){
        this.name = name;  // this keyword is used for calling the instance variable name
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    } // this method helps us to set all the information at once


    public void eat(){
        System.out.println(name +" is eating poo");
    }
    public void drink(){
        System.out.println(name +" is drinking water");
    }
    public String toString() {  // this method is to avoid hash-code when we print the class object
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
