package br.com.JavaOneForAll.lesson203Streams.test;

import br.com.JavaOneForAll.lesson203Streams.domain.LightNovel;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest11 {

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
        System.out.println(lightNovelList.stream().count());
        System.out.println(lightNovelList.stream().collect(Collectors.counting()));

        lightNovelList.stream()
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        lightNovelList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);

        System.out.println(lightNovelList.stream()
                .mapToDouble(LightNovel::getPrice)
                .sum());

        System.out.println(lightNovelList.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        lightNovelList.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovelList.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovelList.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        List<String> collectTitle = lightNovelList.stream().map(LightNovel::getTitle).collect(Collectors.toList());
        System.out.println(collectTitle);

        String titles = lightNovelList.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
