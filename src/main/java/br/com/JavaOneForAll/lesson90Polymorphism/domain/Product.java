package br.com.JavaOneForAll.lesson90Polymorphism.domain;

public abstract class Product implements Taxable {

    protected String name;
    protected  double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
