package day24_Date_and_Time;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
             /// LocalDate Collection
        LocalDate today = LocalDate.now(); //* "NOW" - current date
        System.out.println(today);

        LocalDate birthday = LocalDate.of(1972,5,19); //* "OF" - any date
        System.out.println(birthday);
        System.out.println("===============================================");

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());       //* GET some info
        System.out.println(birthday.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());
        System.out.println("===============================================");

        birthday = birthday.plusYears(1); //* in order to add the year, need to assign back to original object
        System.out.println(birthday);   //* plusDays; plusMonth; plusWeeks; ...minus......
        System.out.println("===============================================");



    }
}
