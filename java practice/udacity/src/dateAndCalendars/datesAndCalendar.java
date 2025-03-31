package dateAndCalendars;

import java.util.Calendar;
import java.util.Date;

public class datesAndCalendar {

    public static void main(String[] args) {
        datesAndCalendar.displayCurrentDate();
        datesAndCalendar.displaySetDate();
    }

    private static void displayCurrentDate(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Date date = new Date();
        System.out.println(date);
        calendar.setTime(date);
        System.out.println(calendar.getTime());
    }

    private static void displaySetDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2031, 02, 02);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}