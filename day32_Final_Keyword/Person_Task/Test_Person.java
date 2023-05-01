package day32_Final_Keyword.Person_Task;

import java.time.LocalDate;

public class Test_Person {
    public static void main(String[] args) {

        Person person = new Person("Mike",'M', LocalDate.of(1972,5,19));
        System.out.println(person);
        person.breath();

        System.out.println("============================================================================");

        Employee employee = new Employee("Katya",'F',LocalDate.of(2004,8,15),"secretary",80000);
        System.out.println(employee);
        employee.breath();


    }
}
