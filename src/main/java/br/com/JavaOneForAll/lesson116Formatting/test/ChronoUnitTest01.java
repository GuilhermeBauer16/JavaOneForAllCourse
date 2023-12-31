package br.com.JavaOneForAll.lesson116Formatting.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(1988, Month.AUGUST,12,0,0);
        System.out.println(ChronoUnit.DAYS.between(birthday, LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(birthday, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(birthday, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(birthday, LocalDateTime.now()));
        System.out.println(ChronoUnit.MINUTES.between(birthday, LocalDateTime.now()));
        System.out.println(ChronoUnit.SECONDS.between(birthday, LocalDateTime.now()));
        System.out.println(ChronoUnit.MINUTES.between(birthday, LocalDateTime.now()));
    }
}
