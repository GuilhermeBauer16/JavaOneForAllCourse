package br.com.JavaOneForAll.lesson203Streams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest10 {

    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2)
                .limit(100)
                .forEach(System.out::println);


        Stream.iterate(new int[]{0,1} , a -> new int[] { a[1] , a[0] + a[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        Stream.iterate(new int[]{0,1} , a -> new int[] { a[1] , a[0] + a[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);

        ThreadLocalRandom localRandom = ThreadLocalRandom.current();
        Stream.generate(() -> localRandom.nextInt(1,1000))
                .limit(10)
                .forEach(System.out::println);
    }
}
