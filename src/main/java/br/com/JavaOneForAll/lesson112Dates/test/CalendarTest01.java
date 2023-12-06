package br.com.JavaOneForAll.lesson112Dates.test;

import java.util.Calendar;

public class CalendarTest01 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.toInstant());
        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Sunday is the first day of the week" );

        }
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK);

        calendar.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println(calendar.toInstant());
    }
}
