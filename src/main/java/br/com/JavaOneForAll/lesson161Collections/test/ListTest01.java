package br.com.JavaOneForAll.lesson161Collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Guilherme");
        names.add("John");
        names.add("Anna");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("===============");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        List<Integer> numbers = new ArrayList<>();
        int number = 0;
        numbers.add(number);
    }
}
