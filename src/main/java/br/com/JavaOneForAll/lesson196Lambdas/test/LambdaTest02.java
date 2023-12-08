package br.com.JavaOneForAll.lesson196Lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest02 {

    public static void main(String[] args) {

        List<String> names = List.of("Guilherme", "John", "Ana", "Pedro");
        System.out.println(map(names, (String s) -> s.length()));
        System.out.println(map(names , (String s) -> s.toUpperCase()));

    }

    private static <T,R> List<R> map(List<T> list , Function<T,R> function){
        List<R> result = new ArrayList<>();
        for(T t : list){
            R r = function.apply(t);
            result.add(r);
        }
        return result;
    }

}
