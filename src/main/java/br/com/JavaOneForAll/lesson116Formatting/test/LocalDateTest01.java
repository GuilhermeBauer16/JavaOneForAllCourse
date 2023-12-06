package br.com.JavaOneForAll.lesson116Formatting.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalDateTest01 {
    public static void main(String[] args) {
//        System.out.println(new Date());
//        System.out.println(Calendar.getInstance());
//        LocalDate localDate = LocalDate.of(2022 , Month.DECEMBER , 24);
//        System.out.println(localDate);
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getDayOfMonth());
//        System.out.println(localDate.getDayOfWeek());
//        System.out.println(localDate.lengthOfMonth());
//        System.out.println(localDate.lengthOfYear());
//        System.out.println(localDate.now());

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
        dateNow = dateNow.plusDays(2);
        dateNow = dateNow.plusWeeks(2);
        dateNow = dateNow.plusYears(2);
        System.out.println(dateNow);
    }
}
