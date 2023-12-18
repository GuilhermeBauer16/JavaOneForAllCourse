package br.com.JavaOneForAll.lesson203Streams.test;

import br.com.JavaOneForAll.lesson203Streams.domain.Category;
import br.com.JavaOneForAll.lesson203Streams.domain.LightNovel;
import br.com.JavaOneForAll.lesson203Streams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamsTest15 {

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
        Map<Category, DoubleSummaryStatistics> collect = lightNovelList.stream().collect(groupingBy(LightNovel::getCategory
                , Collectors.summarizingDouble(LightNovel::getPrice)));

        System.out.println(collect);
        System.out.println("------");

        Map<Category, Set<Promotion>> collect1 = lightNovelList.stream().collect(groupingBy(LightNovel::getCategory,
                Collectors.mapping(StreamsTest15::getPromotion, Collectors.toSet())));

        System.out.println(collect1);
        System.out.println("------");

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovelList.stream().collect(groupingBy(LightNovel::getCategory,
                Collectors.mapping(StreamsTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));

        System.out.println(collect2);

    }

    private static Promotion getPromotion(LightNovel lightNovel) {
        return lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }


}
