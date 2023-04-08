package day25_Constructor;

import java.time.LocalDate;

public class Test_Employee {
    public static void main(String[] args) {

        Employee_CustomClass secretary = new Employee_CustomClass("Masha", 21, 'F', "Secretary", 80_000, LocalDate.of(2022, 12, 05));

        System.out.println(secretary);
        System.out.println("=================================================================");

        Person_CustomClass person1 =new Person_CustomClass("Vika",18,'F',LocalDate.of(2002,05,23),"no","yes");
        System.out.println(person1);
    }
}
