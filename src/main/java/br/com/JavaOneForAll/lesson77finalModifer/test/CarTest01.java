package br.com.JavaOneForAll.lesson77finalModifer.test;

import br.com.JavaOneForAll.lesson77finalModifer.domain.Car;

public class CarTest01 {

    public static void main(String[] args) {
        Car car = new Car();
        car.BUYER.setName("John");
        System.out.println(car.BUYER.toString());
        car.print();

    }
}

