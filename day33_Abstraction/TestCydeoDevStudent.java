package day33_Abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudent {
    public static void main(String[] args) {

        CydeoDevStudent student1=new CydeoDevStudent("Kaka",'F', LocalDate.of(2000,11,5),"A1","Alumni dev",28);
        System.out.println(student1);
        student1.breath();
        student1.eat();
        student1.drink();
        student1.sleep();

    }
}
