package day32_Final_Keyword;

import java.time.LocalDate;

 class Student{

    public final void language(){
        System.out.println("Java Programming");
    }

}
public class FinalKeyword extends Student {

   // public void language(){
       // System.out.println("Python");
    //}


    public FinalKeyword() {  // constructor can not be final

    }

    public static void main(String[] args) {

        final char gender = 'M';
        System.out.println(gender);

        // gender = 'F';
        System.out.println("==================================");

        final LocalDate dateOfBirth = LocalDate.now();
        System.out.println(dateOfBirth);

        // dateOfBirth = dateOfBirth.plusYears(1);
        System.out.println("==================================");

        new Student().language();
        new FinalKeyword().language();


    }



}
