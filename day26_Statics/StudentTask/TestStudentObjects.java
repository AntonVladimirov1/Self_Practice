package day26_Statics.StudentTask;

public class TestStudentObjects {
    public static void main(String[] args) {


        Student student1 = new Student("Masha",21,'F',"A21");
        Student student2 = new Student("Katya",19,'F',"A19BA");
        Student student3 = new Student("Kieko",22,'F',"A22B");
        Student student4 = new Student("Natys",24,'F',"A24A");
        Student student5 = new Student("Karry",21,'F',"A21BA");

        StudentsGroup group1 = new StudentsGroup("All",1);
        group1.addStudent(s);
        System.out.println(group1);

    }

}
