package br.com.JavaOneForAll.lesson203Streams.test;

import br.com.JavaOneForAll.lesson203Streams.domain.Category;
import br.com.JavaOneForAll.lesson203Streams.domain.LightNovel;


import java.util.*;
import java.util.stream.Collectors;

public class StreamsTest14 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("I don't know", 10.99, Category.DRAMA),
            new LightNovel("My", 13.99, Category.DRAMA),
            new LightNovel("test", 1.99, Category.ROMANCE),
            new LightNovel("person", 3.67 , Category.DRAMA),
            new LightNovel("person", 3.67, Category.FANTASY),
            new LightNovel("person2", 6.67, Category.DRAMA),
            new LightNovel("person3", 3.67, Category.DRAMA)
    ));

    public static void main(String[] args) {

        Map<Category, Long> collect = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));

        System.out.println(collect);
        System.out.println("------------");

        Map<Category, Optional<LightNovel>> collect1 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);
        System.out.println("------------");
        Map<Category, LightNovel> collect2;
        collect2 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        System.out.println(collect2);
    }


}
