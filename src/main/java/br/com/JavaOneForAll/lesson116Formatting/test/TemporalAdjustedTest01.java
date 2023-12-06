package br.com.JavaOneForAll.lesson116Formatting.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustedTest01 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        localDate = localDate.withDayOfMonth(12);
        System.out.println(localDate);
        localDate = localDate.with(ChronoField.DAY_OF_MONTH ,12);
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());
        System.out.println("/=".repeat(30));
        LocalDate localDate1 = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY));
        System.out.println(localDate1);
        System.out.println(localDate1.getDayOfWeek());
        localDate1 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(localDate1);
        System.out.println(localDate1.getDayOfWeek());
        localDate1 = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));
        System.out.println(localDate1);
        System.out.println(localDate1.getDayOfWeek());
        localDate1 = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(localDate1);
        System.out.println(localDate1.getDayOfWeek());
        localDate1 = LocalDate.now().with(TemporalAdjusters.firstDayOfYear());
        System.out.println(localDate1);
        System.out.println(localDate1.getDayOfWeek());
        localDate1 = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(localDate1);
        System.out.println(localDate1.getDayOfWeek());
        localDate1 = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(localDate1);
        System.out.println(localDate1.getDayOfWeek());

        localDate1 = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(localDate1);
        System.out.println(localDate1.getDayOfWeek());
        localDate1 = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        System.out.println(localDate1);
        System.out.println(localDate1.getDayOfWeek());

    }
}
