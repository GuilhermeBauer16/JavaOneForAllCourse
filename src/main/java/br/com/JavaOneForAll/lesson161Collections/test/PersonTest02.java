package br.com.JavaOneForAll.lesson161Collections.test;

import br.com.JavaOneForAll.lesson161Collections.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonTest02 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(5L , "Guilherme" , 12));
        people.add(new Person(7L , "john" , 20));
        people.add(new Person(1L , "Pedro" , 100));
        people.add(new Person(3L , "Ana" , 18));
        people.add(new Person(2L , "Jenesio" , 56));

        for (Person person : people){
            System.out.println(person.toString());
        }

        System.out.println();
    }
}
