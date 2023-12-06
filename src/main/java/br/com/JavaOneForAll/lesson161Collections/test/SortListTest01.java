package br.com.JavaOneForAll.lesson161Collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest01 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Guilherme");
        names.add("john");
        names.add("Pedro");
        names.add("Anna");
        names.add("Abner");
        System.out.println(names);

        for (String name: names) {
            Collections.sort(names);
            System.out.println(names);
        }

    }
}
