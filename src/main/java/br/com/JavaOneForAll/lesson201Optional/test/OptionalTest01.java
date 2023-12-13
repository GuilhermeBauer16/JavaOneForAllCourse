package br.com.JavaOneForAll.lesson201Optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {

        Optional<String> o1 = Optional.of("Hello Guilherme, awesome course ");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(findName(o1.get()));
        Optional<String> name = findName("Hero");
        System.out.println(name);
        System.out.println(name.orElse("EMPTY"));
        name.ifPresent(s -> System.out.println(s.toUpperCase()));


    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("Hero", "anything");
        int i = list.indexOf(name);
        if (i < -1){
            return Optional.of(list.get(i));
        }

        return Optional.empty();
    }

    String name2 = findName("William").orElseThrow(IllegalAccessError::new);
}
