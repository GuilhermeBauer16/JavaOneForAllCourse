package br.com.JavaOneForAll.lesson203Streams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest05 {

    public static void main(String[] args) {
        List<String> words = List.of("Gomu" , "Gomu" , "no" , "mi");
        String[] split = words.get(0).split("");
        System.out.println(Arrays.toString(split));
        List<String> collect = words.stream().map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
