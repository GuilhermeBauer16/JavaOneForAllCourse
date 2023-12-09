package br.com.JavaOneForAll.lesson196Lambdas.test;

import br.com.JavaOneForAll.lesson196Lambdas.domain.Book;
import br.com.JavaOneForAll.lesson196Lambdas.service.BookComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Guilherme", "John", "Pedro"));
        names.sort(String::compareTo);

        System.out.println(names);

        Function<String,Integer> numToStringInteger = Integer::parseInt;
        Integer num = numToStringInteger.apply("10");
        System.out.println(num);

        BiPredicate<List<String>,String> checkName = List::contains;
        System.out.println(checkName.test(names,"Guilherme"));
    }
}
