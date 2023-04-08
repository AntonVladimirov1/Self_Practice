package Live_Sessions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Holidays {

    public static ArrayList<LocalDate> getHolidays(){

                    //* or just return vvv if we don't need the name
        ArrayList<LocalDate> holidays =new ArrayList<>(Arrays.asList(

                LocalDate.of(2023,1,1),
                LocalDate.of(2023,1,16),
                LocalDate.of(2023,4,10),
                LocalDate.of(2023,5,5),
                LocalDate.of(2023,6,18),
                LocalDate.of(2023,7,12),
                LocalDate.of(2023,8,18),
                LocalDate.of(2023,9,24),
                LocalDate.of(2023,10,17),
                LocalDate.of(2023,11,13),
                LocalDate.of(2023,11,8),
                LocalDate.of(2023,12,19),
                LocalDate.of(2023,12,26)
        ));
        return holidays;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What month do you want to check the dates for:");

        int inputMonth = input.nextInt();
             //* here we can format the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/y");

        for (LocalDate eachDate : getHolidays()){ // iterates through all the LocalDate objects

            if (eachDate.getMonthValue()==inputMonth){
                System.out.println(eachDate.format(formatter));
            }
        }
    }

}
