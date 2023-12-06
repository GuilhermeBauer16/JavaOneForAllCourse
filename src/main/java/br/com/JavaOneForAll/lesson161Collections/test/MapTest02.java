package br.com.JavaOneForAll.lesson161Collections.test;

import br.com.JavaOneForAll.lesson161Collections.domain.Customer;
import br.com.JavaOneForAll.lesson161Collections.domain.Person;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Guilherme Bauer");
        Customer customer2 = new Customer("John");

        Person person1 = (new Person(5L, "Guilherme", 12));
        Person person2 = (new Person(7L, "john", 20));
        Person person3 = (new Person(1L, "Pedro", 100));
        Person person4 = (new Person(3L, "Ana", 18));
        Person person5 = (new Person(2L, "Jenesio", 56));

        Map<Customer, Person> customerPersonMap = new HashMap<>();
        customerPersonMap.put(customer1,person1);
        customerPersonMap.put(customer2,person2);

        for (Map.Entry<Customer,Person> entry : customerPersonMap.entrySet()){
            System.out.println(entry.getKey().getName()  + ": " + entry.getValue().getName());
        }
    }
}
