package day28_OOP_Encapsulation;

public class TestEmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        System.out.println(employee1.getSalary());

        employee1.setSalary(120_000);
        System.out.println(employee1.getSalary());

        System.out.println(employee1.getName());
        employee1.setName("Kolyan");
        System.out.println(employee1.getName());

    }

}
