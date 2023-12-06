package br.com.JavaOneForAll.lesson54;

import java.sql.SQLOutput;

public class Person {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age < 0){
            System.out.println("Please type a valid age!");
            return ;
        }
        this.age = age;
    }

    public void print(){
        System.out.println("name:" + this.name + "\n" + "age: " + this.age);

    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
