package day28_OOP_Encapsulation;

import java.time.LocalDate;

public class Person {

    private String name;
    private char gender;
    private LocalDate dateOfBirth;
    private int age;


        public String getName() {
        if (name == null) {
            return "Unknown";
        }
        return name;
    }
        public void setName (String name){
        if (name==null||name.isBlank()||name.isEmpty()){
            System.err.println("Name can not be NULL/empty/blank");
            System.exit(1);
        }
            this.name = name;
        }

        public int getAge () {
            return age;
        }
        public void setAge ( int age){
        if (age<0||age>100){
            System.err.println("Age can not be less than '0' or greater than '100'");
            System.exit(1);
        }
            this.age = age;
        }

        public char getGender () {
            return gender;
        }
        public void setGender ( char gender){
        if (gender!='M'&&gender!='F'){
            System.err.println("Gender can only be 'M' or 'F'");
        }
            this.gender = gender;
        }

        public LocalDate getDateOfBirth () {
            return dateOfBirth;
        }
        public void setDateOfBirth ( LocalDate dateOfBirth){
            this.dateOfBirth = dateOfBirth;
        }

    public Person(String name) {
        setName(name);
    }
    public Person(String name, char gender) {
        this(name);
        setGender(gender);
    }
    public Person(String name, char gender, LocalDate dateOfBirth) {
        this(name,gender);
        setDateOfBirth(dateOfBirth);
        this.age = LocalDate.now().getYear()-dateOfBirth.getYear();
    }


    public String toString() {
        return "Person{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", gender = " + gender +
                ", dateOfBirth = '" + dateOfBirth + '\'' +
                '}';
    }
}
