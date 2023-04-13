package Live_Sessions.Local_Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter day");
        int day = scanner.nextInt();
        System.out.println("Enter hour");
        int hour = scanner.nextInt();
        int minute =0;

        LocalDateTime reservationDate = LocalDateTime.of(year,month,day,hour,minute);
        LocalDateTime now = LocalDateTime.now();
        if (reservationDate.getYear()!=2023 || reservationDate.isBefore(now)){
            System.out.println("Sorry you can reserve only current year");
            System.exit(0);
        }
       /* LocalDateTime now = LocalDateTime.now();
        if (reservationDate.isBefore(now)){
            System.out.println("You cannot reserve this year");
            System.exit(0);
        } */


        LocalDate reserved1 = LocalDate.of(2023,11,23);
        LocalDate reserved2 = LocalDate.of(2023,12,24);

        LocalDate reservationDate2 = LocalDate.of(year,month,day);
        if (reservationDate2.isEqual(reserved1)&&reservationDate2.isEqual(reserved2)){
            System.out.println("Sorry that dates is fully booked");
            System.exit(0);
        }
        switch (reservationDate.getDayOfWeek().getValue()){
            case 5:
            case 6:
            case 7:
                if (reservationDate.getHour()>=14&&reservationDate.getHour()<=20){
                    System.out.println("Booked for "+reservationDate.format(DateTimeFormatter.ISO_DATE_TIME));
                }else {
                    if (reservationDate.getHour()<14){
                        System.out.println("Not open yet");
                    }
                    if (reservationDate.getHour()>20){
                        System.out.println("Closed");
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Sorry we only have availability on weekends");
                break;
        }


    }
}
