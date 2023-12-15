package br.com.JavaOneForAll.lesson203Streams.test;

import br.com.JavaOneForAll.lesson203Streams.domain.Category;
import br.com.JavaOneForAll.lesson203Streams.domain.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsTest12 {

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
        Map<Category,List<LightNovel>> lightNovelsMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();

        for(LightNovel lightNovel : lightNovelList){

            switch (lightNovel.getCategory()){
                case DRAMA -> drama.add(lightNovel);
                case FANTASY -> fantasy.add(lightNovel);
                case ROMANCE -> romance.add(lightNovel);
            }

        }

//        fantasy.stream().forEach(System.out::println);
//        drama.stream().forEach(System.out::println);
//        romance.stream().forEach(System.out::println);

        lightNovelsMap.put(Category.FANTASY, fantasy);
        lightNovelsMap.put(Category.DRAMA , drama);
        lightNovelsMap.put(Category.ROMANCE , romance);
        System.out.println(lightNovelsMap);
        System.out.println("---------------");
        Map<Category, List<LightNovel>> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
        }
}
