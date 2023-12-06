package br.com.JavaOneForAll.lesson116Formatting.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjustedTest02 {
    static class NextBusinessDay implements TemporalAdjuster {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            DayOfWeek dayOFWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
            int addDays;
            switch (dayOFWeek){
                case THURSDAY:
                    addDays = 4;
                    break;
                case FRIDAY:
                    addDays = 3;
                    break;
                case SATURDAY:
                    addDays = 2;
                    break;

                default: addDays = 1;
            }
            return temporal.plus(addDays , ChronoUnit.DAYS);
        }
    }

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now().plusDays(1);
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        localDate = LocalDate.now().plusDays(1).with(new NextBusinessDay());
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

    }
}
