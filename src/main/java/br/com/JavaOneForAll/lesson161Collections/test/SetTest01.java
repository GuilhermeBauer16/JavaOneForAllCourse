package br.com.JavaOneForAll.lesson161Collections.test;

import br.com.JavaOneForAll.lesson161Collections.domain.Person;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {

    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person(5L, "Guilherme", 0));
        people.add(new Person(7L, "john", 20));
        people.add(new Person(1L, "Pedro", 100));
        people.add(new Person(3L, "Ana", 18));
        people.add(new Person(2L, "Jenesio", 56));

        for ( Person person : people){

        }
    }
}
