package br.com.JavaOneForAll.lesson161Collections.test;

import br.com.JavaOneForAll.lesson161Collections.domain.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparePersonByName implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());
    }
}

public class PersonTest01 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(5L, "Guilherme", 12));
        people.add(new Person(7L, "john", 20));
        people.add(new Person(1L, "Pedro", 100));
        people.add(new Person(3L, "Ana", 18));
        people.add(new Person(2L, "Jenesio", 56));

        for (Person person : people) {
            System.out.println(person.toString());
        }
        System.out.println("========================");
        Collections.sort(people);
        System.out.println(people);
        System.out.println("========================");

        people.sort(new ComparePersonByName());
        for (Person person : people) {
            System.out.println(person.toString());
        }

        System.out.println("========================");

    }


}
