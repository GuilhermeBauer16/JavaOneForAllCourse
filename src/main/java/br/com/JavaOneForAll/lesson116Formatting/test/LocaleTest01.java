package br.com.JavaOneForAll.lesson116Formatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it" , "IT");
        Locale localeCh = new Locale("en" , "CH");
        Locale localeJapan = new Locale("ja" , "JP");
        Locale localeIndia = new Locale("hi" , "IN");
        Locale localeNetherlands = new Locale("nl","NL");
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL,localeCh);
        DateFormat dateFormats = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        DateFormat dateFormatJP = DateFormat.getDateInstance(DateFormat.FULL,localeJapan);
        DateFormat dateFormatIN = DateFormat.getDateInstance(DateFormat.FULL,localeIndia);
        DateFormat dateFormatNL = DateFormat.getDateInstance(DateFormat.FULL,localeNetherlands);
        System.out.println(dateFormats.format(calendar.getTime()));
        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println(dateFormatJP.format(calendar.getTime()));
        System.out.println(dateFormatIN.format(calendar.getTime()));
        System.out.println(dateFormatNL.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeItaly.getDisplayLanguage());
    }
}
