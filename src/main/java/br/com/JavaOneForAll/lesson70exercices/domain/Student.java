package br.com.JavaOneForAll.lesson70exercices.domain;

public class Student {
    private String name;
    private int age;

    Seminar seminar;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Seminar seminar) {
        this.name = name;
        this.age = age;
        this.seminar = seminar;
    }

    public void print(){

        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);


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

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }
}
