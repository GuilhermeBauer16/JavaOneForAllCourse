package br.com.JavaOneForAll.lesson161Collections.test;

import br.com.JavaOneForAll.lesson161Collections.domain.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(5L, "Guilherme", 0));
        people.add(new Person(7L, "john", 20));
        people.add(new Person(1L, "Pedro", 100));
        people.add(new Person(3L, "Ana", 18));
        people.add(new Person(2L, "Jenesio", 56));

        Iterator<Person> personIterator = people.iterator();

        while (personIterator.hasNext()){
            Person next = personIterator.next();

            if(next.getAge() == 0){
                personIterator.remove();
            }
        }
        people.add(new Person(4L , "Gabriel" , 0));
        people.removeIf(person -> person.getAge() == 0);

        System.out.println(people);
    }
}
