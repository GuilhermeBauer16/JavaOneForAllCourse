package br.com.JavaOneForAll.lesson116Formatting.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Três Cachoeiras ' dd 'de ' MMMM 'de ' yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
        try {
            System.out.println(simpleDateFormat.parse("Três Cachoeiras  11 de  November de  2023"));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
