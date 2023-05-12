package day38_Exception_Handling;

class CustomCheckedException extends Exception{

}

class CustomUncheckedException extends RuntimeException{

}

public class Custom_Exception {
    public static void main(String[] args)  {

        try {
            throw new CustomCheckedException();
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }
        System.out.println("================================");

        throw new CustomUncheckedException();
    }

}
