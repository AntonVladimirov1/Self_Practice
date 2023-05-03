package day33_Abstraction.Employee_Task;

public class TestEmployee {
    public static void main(String[] args) {
        Developer developer=new Developer("Bobby",29,'M',"12AB","Developer",150_000,"Java");
        System.out.println(developer);
        Teacher teacher=new Teacher("Kukushka",45,'F',"45AB","math guru",80_000);
        System.out.println(teacher);
        Driver driver=new Driver("Ninja",34,'M',"AB15","car guru",95_000);
        System.out.println(driver);
        Tester tester=new Tester("Yuki",23,'F',"AB78","tester",85_000);
        System.out.println(tester);

        tester.work();
        developer.work();
    }
}
