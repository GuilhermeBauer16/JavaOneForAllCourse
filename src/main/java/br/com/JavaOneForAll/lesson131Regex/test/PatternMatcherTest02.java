package br.com.JavaOneForAll.lesson131Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {

    public static void main(String[] args) {
        String regex = "\\d";
        String text = "tyjty34fgh1123";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
