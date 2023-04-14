package day29_Inheritance.Encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender,grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName(){
        if (name==null){
            name="Unknown";
        }
        return name;
    }
    public void setName(String name){
        if (name.isEmpty()){
            System.err.println("Invalid student name");
            System.exit(1);
        }
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age<16||age>60){
            System.err.println("Age can only be between 16 and 60");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        if (gender=='M'|| gender=='F'){
            this.gender = gender;
        }else {
            System.out.println("Invalid gender type");
            System.exit(1);
        }
    }

    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';
        if (isValid) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade");
            System.exit(1);
        }
    }

    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name+" is studying at "+schoolName);
    }

    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", gender = " + gender +
                ", grade = " + grade +
                ", schoolName = '" + schoolName + '\'' +
                '}';
    }
}
