package day26_Statics.StudentTask;

public class TestStudentObjects {
    public static void main(String[] args) {


        Student student1 = new Student("Masha",21,'F',"A21");
        Student student2 = new Student("Katya",19,'F',"A19BA");
        Student student3 = new Student("Kieko",22,'F',"A22B");
        Student student4 = new Student("Natys",24,'F',"A24A");
        Student student5 = new Student("Karry",21,'F',"A21BA");

       /* ArrayList<Student> group1 =new ArrayList<>();
        group1.addAll(Arrays.asList(student1,student2,student3,student4,student5));
        System.out.println(group1); */

        StudentsGroup group1 = new StudentsGroup("All",1);
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        System.out.println(group1);
        System.out.println();
        System.out.println("=======================================================================");

        group1.removeStudent("A21");
        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name+" / "+ each.id);
        }
        System.out.println("========================================================================");


    }

}
