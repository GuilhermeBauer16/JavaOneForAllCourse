package br.com.JavaOneForAll.lesson184Gererics.test;

abstract class Animal {
    public abstract void consult();
}

class Dog extends Animal {

    @Override
    public void consult() {
        System.out.println("consulting a dog");
    }
}

class Cat extends Animal {

    @Override
    public void consult() {
        System.out.println("Consulting a cat");
    }
}
public class WildCardTest01 {

    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog() , new Dog()};
        Cat[] cats = {new Cat(), new Cat() , new Cat()};
        printConsult(dogs);
        printConsult(cats);

    }

    private static void printConsult(Animal[] animals){
        for (Animal animal : animals){
            animal.consult();
        }
    }
}
