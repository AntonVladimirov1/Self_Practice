package day23_ArrayList;

import day17_CustomClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEmployee {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList( new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        for (Employee each : employees) {
            System.out.println(each.name+ " : " +each.jobTitle);
        }
        System.out.println("=====================================================");

        for (Employee each : employees) {
            if (each.jobTitle.equals("Java Developer")){  // if the JobTitle is Java Developer
                System.out.println(each.name);
            }
        }
        System.out.println("=====================================================");

        double max = employees.get(0).salary;
        double min = employees.get(0).salary;
        for (Employee each : employees) {
            if (each.salary > max){
                max = each.salary;
            } else if (each.salary < min) {
                min = each.salary;
            }
        }
        System.out.println("max = "+max+"\nmin = "+min);
        System.out.println("=====================================================");

        ArrayList<Employee> female = new ArrayList<>();
        ArrayList<Employee> male = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.gender == 'M'){
                male.add(employee);
            }else {
                female.add(employee);
            }
        }
        System.out.println("female count: "+female.size()+"\nmale count: "+male.size());
    }
}
/* Note: Employee class is imported from day17 package

	        1.1 Write a program that can display the name and job title of each employee

	        1.2 Write a program that can display the names of "Java Developers"

	        1.3 Write a program that can display the maximum and minimum salary

	        1.4 Create two arraylists named female and maleEmployees, write a program that
	         can add all the female employees and male employees to the female and maleEmployees arraylists */
