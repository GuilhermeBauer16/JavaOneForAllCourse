package br.com.JavaOneForAll.lesson161Collections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> numbers01 = new ArrayList<>();
        numbers01.add(1);
        numbers01.add(2);
        numbers01.add(3);
        numbers01.add(4);

        Integer[] numbersArray01 = numbers01.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numbersArray01));
        System.out.println(numbers01);;
        System.out.println("==============");

        Integer[] numbersArray02 = {1,2,3};
        System.out.println(Arrays.toString(numbersArray02));
        List<Integer> numbers02 = new ArrayList<>(Arrays.asList(numbersArray02));
        numbers02.add(11);
        System.out.println(numbers02);
    }
}
