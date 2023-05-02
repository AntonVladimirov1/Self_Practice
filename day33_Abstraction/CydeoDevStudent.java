package day33_Abstraction;

import day32_Final_Keyword.Person_Task.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {

    private final String id;
    private String batchName;
    private int batchNumber;
    private static final String programmingLanguage;
    static {
        programmingLanguage = "Java";
    }

    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {

        super(name, gender, dateOfBirth);
        if (getAge()<18){  // we can put any condition only after constructor set
            System.err.println("Cydeo Developer student must be at least 18 years old");
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }
    public void setBatchName(String batchName) {
        if (batchName.equalsIgnoreCase("zero to hero")||batchName.equalsIgnoreCase("alumni dev")){
            this.batchName = batchName;
        }else{
            System.err.println("Invalid batch name, no such batch in Cydeo");
        }

    }

    public int getBatchNumber() {
        return batchNumber;
    }
    public void setBatchNumber(int batchNumber) {
        if (batchNumber<0){
            System.err.println("Invalid batch number (can not be negative)");
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating "+programmingLanguage);
    }
    @Override
    public void drink() {
        System.out.println(getName()+" is drinking "+programmingLanguage);
    }
    @Override
    public void sleep() {
        System.out.println(getName()+" doesn't sleep");
    }
    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                " name ='" + getName() + '\'' +
                ", gender =" + getGender() +
                ", age =" + getAge() +
                ", dateOfBirth =" + getDateOfBirth() +
                ", id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
