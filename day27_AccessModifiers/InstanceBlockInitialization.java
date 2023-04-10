package day27_AccessModifiers;

public class InstanceBlockInitialization {

    String name;
    int age;

    {               //* use this Instance block when you need default value for the instance variables
                    //* this is not the best choice - better to use Consructor
        name = "James";
        age = 20;
    }

    public static void main(String[] args) {


        InstanceBlockInitialization obj1 = new InstanceBlockInitialization();
        System.out.println(obj1.name+" / "+obj1.age+" y.o");
    }

}
