package day24_Date_and_Time;

import day17_CustomClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_IF_FromCollection1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        System.out.println(list);
                          /// RemoveIf method !!!!!!!!!
        /* for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4){
                list.remove(i);
            }
        }
        System.out.println(list);*/
        list.removeIf(p -> p<4);       //* VERY IMPORTANT: "p->" and then put condition
        System.out.println(list);
        System.out.println("=====================================================");

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Java","Python","C#","Java","Ruby","C++"));
        System.out.println(names);

        names.removeIf(each-> each.startsWith("J"));
        System.out.println(names);
        System.out.println("===================================================================================");

        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList( new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        employees.removeIf(bigSalary-> bigSalary.salary > 100000);
        for (Employee each : employees) {
            System.out.println(each.name + " : "+ each.salary);
        }

    }
}
/* Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]*/
