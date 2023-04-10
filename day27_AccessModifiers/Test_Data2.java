package day27_AccessModifiers;
import static day27_AccessModifiers.Data.*; // we can import all static members (only if we need it)
public class Test_Data2 {
    public static void main(String[] args) {

        System.out.println(d);
        method3();

        CydeoStudent person1 = new CydeoStudent("Masha",21,'F');
        CydeoStudent person2 = new CydeoStudent("Katya",21,'F');
        CydeoStudent person3 = new CydeoStudent("Karina",21,'F');
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }
}
