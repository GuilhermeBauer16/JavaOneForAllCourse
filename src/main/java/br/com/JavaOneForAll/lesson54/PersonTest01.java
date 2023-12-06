package br.com.JavaOneForAll.lesson54;

public class PersonTest01 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(-1);
        person.print();
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
