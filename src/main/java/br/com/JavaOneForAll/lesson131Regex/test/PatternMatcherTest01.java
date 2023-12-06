package br.com.JavaOneForAll.lesson131Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {

    public static void main(String[] args) {
        String regex = "ab";
        String text = "abaabab";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
