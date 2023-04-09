package day26_Statics.StudentTask;

import java.util.ArrayList;

public class StudentsGroup {

    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        //students = new ArrayList<>(); - also we can instatiate array list here.
    }
    public void addStudent(Student student){ //* this method takes one student and adds it to the ArrayList of the students
        students.add(student);
    }
    public void addStudent(String name,int age,char gender,String id){ //* this method same but takes all arguments of student info and creates student object, then adds the student object to the ArrayList
       // Student student = new Student(name,age,gender,id);
        students.add(new Student(name,age,gender,id)); // can add strait here
    }
    public void removeStudent(String id){  //* this method takes specified ID and removes the student from ArrayList
        students.removeIf(p->p.id.equals(id));
    }

    public String toString() {
        return "\nStudentsGroup{" +
                "groupName= '" + groupName + '\'' +
                ", groupId= " + groupId +
                ", number of students= " + students.size() +
                '}';
    }
}
