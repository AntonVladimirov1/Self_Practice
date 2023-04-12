package day28_OOP_Encapsulation;

public class Employee {

    private String name;
    private double salary;

    public String getName() {
        if (name==null){
            return "Unknown";
        }
        return name;
    }
    public void setName(String name) {
        for (char each : name.toCharArray()) {
            if (!Character.isAlphabetic(each)){
                System.err.println("Name can contain alphabet only");
                System.exit(1);
            }
        }
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary<0){
            System.err.println("Negative salary not allowed");
            System.exit(1);
        }
        this.salary = salary;
    }
}
