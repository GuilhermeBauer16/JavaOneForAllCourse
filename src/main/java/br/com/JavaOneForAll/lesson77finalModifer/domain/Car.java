package br.com.JavaOneForAll.lesson77finalModifer.domain;

public class Car {

    private String name;

    public final Buyer BUYER = new Buyer();
    private static final double SPEED_LIMIT = 250;

    public final void print(){
        System.out.println(this.name);
        System.out.println(BUYER.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
