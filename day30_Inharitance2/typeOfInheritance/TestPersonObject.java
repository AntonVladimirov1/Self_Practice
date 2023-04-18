package day30_Inharitance2.typeOfInheritance;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {


        Student student1 = new Student("Juliy", 'F', LocalDate.of(2000, 5, 15), 'A', "ABD112");

        President president = new President("Petya", 'F', LocalDate.of(1980, 5, 8), LocalDate.of(2020, 7, 12));

        System.out.println(student1);
        System.out.println(president);

        student1.study();
        president.lie();

    }
}
