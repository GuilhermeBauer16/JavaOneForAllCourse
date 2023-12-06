package br.com.JavaOneForAll.lesson131Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {

    public static void main(String[] args) {
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12  oX123a 0x12344h 0x1114b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }

        int hexNumber = 0XC123;
        System.out.println(hexNumber);
    }
}
