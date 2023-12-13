package br.com.JavaOneForAll.lesson203Streams.test;

import br.com.JavaOneForAll.lesson203Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest03 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("I don't know", 10.99),
            new LightNovel("My", 13.99),
            new LightNovel("test", 1.99),
            new LightNovel("person", 3.67),
            new LightNovel("person", 3.67),
            new LightNovel("person2", 6.67),
            new LightNovel("person3", 3.67)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovelList.stream();
        lightNovelList.forEach(System.out::println);

        long count = stream.filter(lightNovel -> lightNovel.getPrice() < 4).count();
        System.out.println(count);

    }
}
