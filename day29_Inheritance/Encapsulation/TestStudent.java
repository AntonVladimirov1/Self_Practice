package day29_Inheritance.Encapsulation;

public class TestStudent {
    public static void main(String[] args) {

        Student student1 = new Student("Masha",17,'F','A',"MiT");
        System.out.println(student1);

        student1.setAge(21);
        student1.setSchoolName("Harvard");
        System.out.println(student1);


    }
}
