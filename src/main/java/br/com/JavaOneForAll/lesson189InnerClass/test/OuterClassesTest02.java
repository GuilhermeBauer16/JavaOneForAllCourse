package br.com.JavaOneForAll.lesson189InnerClass.test;

public class OuterClassesTest02 {

    private String name = "Guilherme";

    void print(){
        class LocalClass{
            public void printName(){
                System.out.println(name);
            }
        }
        new LocalClass().printName();
    }
    public static void main(String[] args) {

        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();

    }
}
