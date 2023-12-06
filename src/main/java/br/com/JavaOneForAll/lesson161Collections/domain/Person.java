package br.com.JavaOneForAll.lesson161Collections.domain;

import br.com.JavaOneForAll.lesson161Collections.test.PersonTest01;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private Long id;
    private String name;
    private int age;

    public Person(Long id, String name, int age) {
        Objects.requireNonNull(id, "Id must not be null");
        Objects.requireNonNull(name, "name must not be null");
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person other) {
//        if (this.id < other.id) {
//            return -1;
//        } else if (this.id.equals(other.id)) {
//
//            return 0;
//
//        } else {
//
//            return 1;
//
//        }
        return this.id.compareTo(other.id);
//        return this.name.compareTo(other.name);
//        return Integer.compare(this.age,other.age);

    }
}
