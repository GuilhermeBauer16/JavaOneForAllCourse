package br.com.JavaOneForAll.lesson184Gererics.test;

import br.com.JavaOneForAll.lesson184Gererics.domain.Boat;
import br.com.JavaOneForAll.lesson184Gererics.domain.Car;

import java.util.List;

public class GenericsMethodsTest01 {

    public static void main(String[] args) {

        System.out.println(createArrayWithOneObject(new Boat("Big boat")));
        System.out.println(createArrayWithOneObject(new Car("BMW")));

    }

    private static <T> List<T> createArrayWithOneObject(T t) {
        return List.of(t);


    }

}
