package day25_Constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {
                           /// DateFormatter

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/y, EEEE");
                               //* offPattern needs to be provided as a String format
        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2023,8,27);
        System.out.println(date1.format(df));

                           /// TimeFormatter
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time1 = LocalTime.of(7,5);
        System.out.println(time1.format(tf));

                           /// Date & Time Formatter (together)
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/y (HH:mm)");
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts.format(dtf));

    }
}
