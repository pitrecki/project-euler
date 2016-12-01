package task19;

//
//
//You are given the following information, but you may prefer to do some research for yourself.
//
//        1 Jan 1900 was a Monday.
//        Thirty days has September,
//        April, June and November.
//        All the rest have thirty-one,
//        Saving February alone,
//        Which has twenty-eight, rain or shine.
//        And on leap years, twenty-nine.
//        A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
//
//        How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?


import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Pitrecki on 2016-10-07.
 */
public class Task19
{
    public static void main(String[] args) {
        int sundays = 0;
        Calendar calendar = new GregorianCalendar();
        int year = 1901;
        int month = Calendar.JANUARY;
        int day = 1;
        calendar.set(year, month, day);

        for (; year < 2000 + 1; year++) {
            for (month = Calendar.JANUARY; month < Calendar.DECEMBER + 1; month++) {
                calendar.set(year, month, day);
                if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
                    sundays++;
            }
        }

        System.out.println("Liczba niedziel:" + sundays);
    }
}
