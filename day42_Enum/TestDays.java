package day42_Enum;

import java.util.Arrays;

public class TestDays {
    public static void main(String[] args) {

        Days days = Days.MONDAY;

        switch (days){
            case MONDAY:
                System.out.println("It's Monday");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday");
                break;
        }

        Days[] weekdays = Days.values();
        System.out.println(Arrays.toString(weekdays));
    }
}
