package br.com.JavaOneForAll.lesson161Collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(6);
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(3);

        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers,29));

    }
}
