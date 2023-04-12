package day28_OOP_Encapsulation;

public class Getter_Setter {

    private String name = "Masha";
    private int age = 21;
    private String style = "Slim";
    private int size = 1;

    //* Getter method - can ONLY READ data in different class
    public String getName(){
        if (name==null) {
            System.err.println("Name has not been set");
        }
        return name;
    }
    public int getAge(){
        if (age==0){
            System.err.println("Age has not been set");
            // System.exit(1);
        }
        return age;
    }
    public String getStyle(){
        return style;
    }
    public int getSize(){
        return size;
    }


    //* Setter method - can change(REWRITE) private variable
    public void setName(String name){
        boolean hasDigits=false;
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigits = true;
                break;
            }
        }
            if (hasDigits){
                System.err.println("Invalid name - has digits");
                System.exit(1);
            }

        this.name = name;
    }
    public void setAge(int age){
        if (age < 16){
            System.err.println("Not allowed age less than 16< "+age);
           // return; //* exits the program
            System.exit(1);        //* allow to terminate any futher code execution
        }
        this.age = age;
    }

}
