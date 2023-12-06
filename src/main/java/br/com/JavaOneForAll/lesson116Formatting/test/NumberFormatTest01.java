package br.com.JavaOneForAll.lesson116Formatting.test;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeUS);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeIT);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeJP);
        double value = 1_000_000_000_223.2135;
        for (NumberFormat numberFormat : numberFormats){
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(value));
        }





    }
}
