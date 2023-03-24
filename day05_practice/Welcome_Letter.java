package day05_practice;

public class Welcome_Letter {
    public static void main(String[] args) {

        String firstName="Noah",
                lastName= "Smith",
                companyName="Apple";
        long salary= 200000;
        double salaryRate= 20;
        double salaryCorrection=(salary*salaryRate/100);
         int startDay= 10;
          int startMonth= 1;
           long startYear= 2022;
            boolean isFullTime= true;
        String jobTitle= "SDET",
                officeAddress= "One Apple Park Way, Cupertino, CA 95014";

        String fullName= (firstName+" "+lastName),
                fullStartDate= (startMonth+"/"+startDay+"/"+startYear),
                email= (firstName+startDay+"@"+companyName+".com");
        double salary_2_Years= (salary+salaryCorrection);
        System.out.println("\tEmployee Information\nWe have "+fullName+" joining "+companyName+" as "+jobTitle+"\n"+firstName+" will start on "+fullStartDate+" as full time: "+isFullTime+"\n"+firstName+" here is some information about your employment\nYour email is "+email+"\nYour base salary is $"+salary+" and after 2 years it will be $"+salary_2_Years+"\nWelcome aboard, see you at "+officeAddress);

    }
}
