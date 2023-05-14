package Live_Sessions.Exceptions;

public class ExceptionExample {
    public static void main(String[] args) throws InterruptedException {



        try{
            String s = null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.err.println("String cannot be null");
        }
        System.out.println("==================================");
        System.out.println("Lets go further on");
        System.out.println("==================================");

            System.out.println("Start");
            Thread.sleep(3000);
            System.out.println("End");

            String str = "java";
        System.out.println(str.charAt(100));

    }



}
