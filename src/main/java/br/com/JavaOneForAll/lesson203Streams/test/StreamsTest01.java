package br.com.JavaOneForAll.lesson203Streams.test;

import br.com.JavaOneForAll.lesson203Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest01 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("I don't know", 10.99),
            new LightNovel("My", 13.99),
            new LightNovel("test", 1.99),
            new LightNovel("person", 3.67),
            new LightNovel("person2", 6.67),
            new LightNovel("person3", 3.67)
    ));

    public static void main(String[] args) {

        lightNovelList.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovelList);
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovelList) {
            if (lightNovel.getPrice() < 4) {
                titles.add(lightNovel.getTitle());
            }

            if (titles.size() >3){
                break;
            }
        }

        System.out.println(titles);


    }
}
