package br.com.JavaOneForAll.lesson203Streams.test;

import br.com.JavaOneForAll.lesson203Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest04 {

    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigner = List.of("John Silva", "Guilherme Bauer", "Pedro Augusto");
        List<String> developers = List.of("John", "Guilherme", "Pedro");
        List<String> students = List.of("Gabriel", "Anna", "Harry Kane");
        devDojo.add(graphicDesigner);
        devDojo.add(developers);
        devDojo.add(students);

        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }


        }
        System.out.println("==".repeat(40));
        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);


    }
}
