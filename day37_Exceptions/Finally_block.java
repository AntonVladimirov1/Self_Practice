package day37_Exceptions;

public class Finally_block {
    public static void main(String[] args) {

        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println("Runtime exception");
            e.printStackTrace();
            System.exit(1);   // this is the only one way to stop "finally block"
        }finally {
            System.out.println("finally block"); // always run after all
        }

    }
}
