package br.com.JavaOneForAll.lesson131Regex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {

    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([A-Za-z])+(\\.([a-zA-Z])+)+";
        String text = "guilherme@hotmail.com.br, #@joao@gmail.com, test@gmail, example@gmail.com.br ";
        String[] emails = text.split(",");
        System.out.println(Arrays.toString(emails));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }

        int hexNumber = 0XC123;
        System.out.println(hexNumber);
    }
}
