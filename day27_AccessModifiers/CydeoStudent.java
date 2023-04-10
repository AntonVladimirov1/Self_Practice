package day27_AccessModifiers;

public class CydeoStudent {

    String name;
    int age;
    char gender;

    public static String schoolName;
    public static String secretCode;

    static {
        schoolName = "Cydeo";
        secretCode = "Java";
    }

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "CydeoStudent{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", gender = " + gender +
                ", schoolName = " + schoolName +
                ", secretCode = " + secretCode +
                '}';
    }
}
