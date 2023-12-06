package br.com.JavaOneForAll.lesson161Collections.test;

import br.com.JavaOneForAll.lesson161Collections.domain.Person;
import br.com.JavaOneForAll.lesson161Collections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneNameComparable implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
        return smartphone1.getName().compareTo(smartphone2.getName());
    }
}


public class NavigableSetTest01 {

    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneNameComparable());
        set.add(new Smartphone("123", "LG"));

        NavigableSet<Person> people = new TreeSet<>();
        people.add(new Person(5L, "Guilherme", 0));
        people.add(new Person(7L, "john", 20));
        people.add(new Person(1L, "Pedro", 100));
        people.add(new Person(3L, "Ana", 18));


        for (Person person : people.descendingSet() ) {

            System.out.println(person.toString());

        }

        System.out.println("============");

        Person person = new Person(9L, "Jenesio", 56);

        System.out.println("lower: " + people.lower(person));
        System.out.println("floor: " + people.floor(person));
        System.out.println("higher: " + people.higher(person));
        System.out.println("ceiling: " + people.ceiling(person));

        System.out.println(people.size());
        System.out.println(people.pollFirst());
        System.out.println(people.size());
        System.out.println(people.pollLast());
        System.out.println(people.size());
    }
}
