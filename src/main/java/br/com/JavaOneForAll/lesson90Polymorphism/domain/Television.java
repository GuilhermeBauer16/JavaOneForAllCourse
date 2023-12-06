package br.com.JavaOneForAll.lesson90Polymorphism.domain;

public class Television extends Product{

    public static final double TAX_PERCENTAGE = 0.21;
    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        return this.price * TAX_PERCENTAGE;
    }
}
