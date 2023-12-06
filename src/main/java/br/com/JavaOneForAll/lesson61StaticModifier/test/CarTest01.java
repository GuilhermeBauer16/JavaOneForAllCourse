package br.com.JavaOneForAll.lesson61StaticModifier.test;

import br.com.JavaOneForAll.lesson61StaticModifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        System.out.println(Car.getSpeedLimit());
        Car car01 = new Car("BMW" , 270);
        Car car02 = new Car("Mercedes" , 285);
        Car car03 = new Car("Audi" , 290);

        car01.print();
        Car.setSpeedLimit(180);
        car02.print();
        car03.print();
    }
}
