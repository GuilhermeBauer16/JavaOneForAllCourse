package br.com.JavaOneForAll.lesson116Formatting.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = localDateTime.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime1 = instant.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset manausOffSet =ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime =  localDateTime.atOffset(manausOffSet);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime1 = instant.atOffset(manausOffSet);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(localDateTime, manausOffSet);
        System.out.println(offsetDateTime2);


        JapaneseDate japaneseDate = JapaneseDate.now();
        JapaneseDate japaneseDate1 = JapaneseDate.of(1900,12,12);
        System.out.println(japaneseDate1);
        System.out.println(japaneseDate);


    }
}
