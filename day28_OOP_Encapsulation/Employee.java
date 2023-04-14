package day28_OOP_Encapsulation;

public class Employee {

    private String name;
    private double salary;
    private String jobTitle;

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

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Job title cannot be empty");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }


    public Employee(String name, double salary, String jobTitle) {
        setName(name);
        setSalary(salary);
        setJobTitle(jobTitle);

    }

    public String toString() {
        return "Employee{" +
                "name = '" + getName() + '\'' +
                ", salary = " + getSalary() +
                ", jobTitle = '" + getJobTitle() + '\'' +
                '}';
    }
}
