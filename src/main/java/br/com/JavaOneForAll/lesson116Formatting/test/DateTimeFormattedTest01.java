package br.com.JavaOneForAll.lesson116Formatting.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormattedTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        String d1 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String d2 = localDate.format(DateTimeFormatter.ISO_DATE);
        String d3 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        LocalDate parse = LocalDate.parse("20231129" , DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2023-11-29" , DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate parse3 = LocalDate.parse("2023-11-29" , DateTimeFormatter.ISO_DATE);
        System.out.println(parse);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();

        String lt = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(lt);
        LocalDateTime parse4 = LocalDateTime.parse("2023-11-29T18:23:57.1041686", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter yearBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter yearUS = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter yearJN = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String d5 = now.format(yearBR);
        String d6 = now.format(yearUS);
        String d7 = now.format(yearJN);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d7);

        LocalDate parse6 = LocalDate.parse("29/11/2023" , yearBR);
        LocalDate parse7 = LocalDate.parse("11/29/2023" , yearUS);
        LocalDate parse8 = LocalDate.parse("2023/11/29" , yearJN);

        System.out.println(parse6);
        System.out.println(parse7);
        System.out.println(parse8);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy" , Locale.ITALY);
        String d5IT = now.format(dateTimeFormatter);
        System.out.println(d5IT);


    }
}
