package br.com.JavaOneForAll.lesson203Streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest09 {

    public static void main(String[] args) {
        IntStream.range(1,50).filter(number -> number % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("---------");
        IntStream.rangeClosed(1,50).filter(number -> number % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("---------");
        Stream.of("Hi", "Java one for all" , " Developers")
                .map(String::toUpperCase).forEach(System.out::print);

        System.out.println();
        System.out.println("---------");

        int[] numbers = {1,2,3,4,5};
        Arrays.stream(numbers).average().ifPresent(System.out::println);


    }
}
