package utilities;

public class Initials {

    public  static void initial(String firstName,String lastName){
        String initials =firstName.toUpperCase().charAt(0)+ "" +lastName.toUpperCase().charAt(0);
        System.out.println("initial is: "+initials);
    }

}
