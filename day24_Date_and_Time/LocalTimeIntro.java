package day24_Date_and_Time;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {
                    /// LocalTime Collection
        LocalTime startTime = LocalTime.of(10,30);
        System.out.println(startTime);
        LocalTime now = LocalTime.now();
        System.out.println(now);
                  /// It has the same methods as LocalDate.......


    }
}
