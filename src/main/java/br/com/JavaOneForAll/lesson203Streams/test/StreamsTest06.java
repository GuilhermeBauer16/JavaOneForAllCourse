package br.com.JavaOneForAll.lesson203Streams.test;

import br.com.JavaOneForAll.lesson203Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest06 {

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
        System.out.println(lightNovelList.stream().anyMatch(lightNovel -> lightNovel.getPrice() > 9));
        System.out.println(lightNovelList.stream().allMatch(lightNovel -> lightNovel.getPrice() > 0));
        System.out.println(lightNovelList.stream().noneMatch(lightNovel -> lightNovel.getPrice() > 0));

        lightNovelList.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 11)
                .findAny()
                .ifPresent(System.out::println);

        lightNovelList.stream()
                .filter(lightNovel -> lightNovel.getPrice() < 5)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        lightNovelList.stream()
                .filter(lightNovel -> lightNovel.getPrice() < 5)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);


    }
}
