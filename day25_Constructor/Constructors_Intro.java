package day25_Constructor;

public class Constructors_Intro {

    public Constructors_Intro(){
        System.out.println("Object is created by using <No> argument constructor");
    }
    public Constructors_Intro(int a){
        System.out.println("Object is created by using <INT> argument constructor");
    }

    public void add(){

    }

    public static void main(String[] args) {
                 //* Every single object must be created by using related Constructor(see above)
        Constructors_Intro obj1 = new Constructors_Intro(10);
        Constructors_Intro obj2 = new Constructors_Intro();
        Constructors_Intro obj3 = new Constructors_Intro(10);

    }

}
