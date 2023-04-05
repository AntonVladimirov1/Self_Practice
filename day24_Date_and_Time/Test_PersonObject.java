package day24_Date_and_Time;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Test_PersonObject {
    public static void main(String[] args) {

        Person_CustomMethod[] people = {new Person_CustomMethod(),new Person_CustomMethod(),new Person_CustomMethod(),new Person_CustomMethod(),new Person_CustomMethod()};

        people[0].setInfo("Masha",'M', LocalDate.of(2004,5,15));
        people[1].setInfo("Katya",'M', LocalDate.of(2000,1,25));
        people[2].setInfo("Olya",'M', LocalDate.of(2006,11,4));
        people[3].setInfo("Niki",'M', LocalDate.of(1990,8,18));
        people[4].setInfo("Karina",'M', LocalDate.of(2002,6,29));

        // print name & DOB of each person
        // remove all people who age >30 // removeAll


        ArrayList<Person_CustomMethod> students = new ArrayList<>();
        students.addAll(Arrays.asList(people));

        for (Person_CustomMethod each : students) {
            System.out.println(each.name+" : "+each.dateOfBirth);
        }
        System.out.println("================================");

        students.removeIf(older->older.age >30);
        for (Person_CustomMethod each2 : students) {
            System.out.println(each2.name+" : "+each2.age);
        }

    }
}
