package day28_OOP_Encapsulation;

public class Test_GetterSetter {
    public static void main(String[] args) {

        Getter_Setter girl =new Getter_Setter();  //* new object
        System.out.println(girl.getAge()+" / "+ girl.getSize()+" / "+girl.getStyle()); //* "get" Getter method

        girl.setAge(15);          //* "set" Setter method
        System.out.println(girl.getAge());

    }
}
