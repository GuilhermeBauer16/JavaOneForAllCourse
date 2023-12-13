package br.com.JavaOneForAll.lesson203Streams.test;

import br.com.JavaOneForAll.lesson203Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest02 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("I don't know", 10.99),
            new LightNovel("My", 13.99),
            new LightNovel("test", 1.99),
            new LightNovel("person", 3.67),
            new LightNovel("person2", 6.67),
            new LightNovel("person3", 3.67)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovelList.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(lightNovel -> lightNovel.getPrice() < 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
