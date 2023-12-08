package br.com.JavaOneForAll.lesson196Lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {

    public static void main(String[] args) {
        List<String> names = List.of("Guilherme" , "John" , "Ana");
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        forEach(names,(String s) -> System.out.println(s));
        forEach(numbers, (Integer i) ->System.out.println(i))    ;

    }

    private static <T> void forEach(List<T> list , Consumer<T> consumer){
        for (T t: list) {

            consumer.accept(t);

        }
    }
}
