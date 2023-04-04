package day17_CustomClass;

public class Test_Employee_Objects {
    public static void main(String[] args) {

        Employee man1 = new Employee();
        man1.setInfo("Katya",21,'F',"Secretary",95000,"A12");

        Employee man2 = new Employee();
        man2.setInfo("Anton",50,'M',"Java SDET",140000,"A1");

        man2.age = 51; // can adjust value of the class right here

        System.out.println(man1);
        System.out.println(man2);

        man1.work2();
        man2.work();
    }
}
