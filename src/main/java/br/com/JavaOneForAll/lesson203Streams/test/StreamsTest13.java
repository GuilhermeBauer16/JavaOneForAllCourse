package br.com.JavaOneForAll.lesson203Streams.test;

import br.com.JavaOneForAll.lesson203Streams.domain.Category;
import br.com.JavaOneForAll.lesson203Streams.domain.LightNovel;
import br.com.JavaOneForAll.lesson203Streams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsTest13 {

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
        Map<Promotion, List<LightNovel>> collect = lightNovelList.stream()
                .collect(Collectors.groupingBy(lightNovel -> getPromotion(lightNovel)));

        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(lightNovel -> getPromotion(lightNovel))));

        System.out.println("--------");
        System.out.println(collect1);
    }

    private static Promotion getPromotion(LightNovel lightNovel) {
        return lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
