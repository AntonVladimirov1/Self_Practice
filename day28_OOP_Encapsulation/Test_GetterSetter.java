package day28_OOP_Encapsulation;

public class Test_GetterSetter {
    public static void main(String[] args) {

        Getter_Setter girl1 =new Getter_Setter();  //* new object
        System.out.println(girl1.getName()+"/"+girl1.getAge()+"/"+ girl1.getSize()+"/"+girl1.getStyle()); //* "get" Getter method

        girl1.setAge(16);          //* "set" Setter method
        System.out.println(girl1.getAge());

        girl1.setName("Katya");
        System.out.println(girl1.getName());


    }
}
