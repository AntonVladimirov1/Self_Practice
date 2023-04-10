package day27_AccessModifiers;

public class InstanceBlock {

    {                       //* Instance initialization block
        System.out.println("Instance block");
    }

    public InstanceBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();


    }
}
