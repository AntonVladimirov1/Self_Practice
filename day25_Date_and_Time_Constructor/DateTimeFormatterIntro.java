package day25_Date_and_Time_Constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {
                           /// DateTimeFormatter
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/y, EEEE");
                               //* offPattern needs to be provided as a String format
        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2023,8,27);
        System.out.println(date1.format(df));

    }
}
