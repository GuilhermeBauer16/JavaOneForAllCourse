package br.com.JavaOneForAll.lesson203Streams.test;

import br.com.JavaOneForAll.lesson203Streams.domain.Category;
import br.com.JavaOneForAll.lesson203Streams.domain.LightNovel;
import br.com.JavaOneForAll.lesson203Streams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class StreamsTest16 {


    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 1_000_000_0;
        sumFor(num);
        sumStreamParallelIterate(num);
        sumStreamRangedIterate(num);
        sumParallelStreamRangedIterate(num);

        
    }

    private static void sumFor(long num){

        System.out.println("sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 0 ; i < num ; i++){
            result += i;

        }

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");

    }

    private static void sumStreamParallelIterate(long num){

        System.out.println("sumStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");

    }
    private static void sumStreamRangedIterate(Long num){

        System.out.println("sumStreamRangedIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L,num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");


    }

    private static void sumParallelStreamRangedIterate(Long num){

        System.out.println("sumParallelStreamRangedIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L,num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");

    }


}
