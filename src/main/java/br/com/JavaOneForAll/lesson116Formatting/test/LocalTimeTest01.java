package br.com.JavaOneForAll.lesson116Formatting.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime localTimeNow = LocalTime.of(23,56,12);
        System.out.println(localTime);
        System.out.println(localTimeNow);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.MIDNIGHT);
        System.out.println(localTime.MIN);
        System.out.println(localTime.MAX);

    }
}
