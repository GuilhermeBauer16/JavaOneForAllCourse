package br.com.JavaOneForAll.lesson189InnerClass.test;

import br.com.JavaOneForAll.lesson184Gererics.domain.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CarTitle implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getName().compareTo(car2.getName());
    }

}


public class AnonymousClassTest02 {

    public static void main(String[] args) {
        List<Car> cars =  new ArrayList(List.of(new Car("Volvo"), new Car("Audi")));
        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getName().compareTo(car2.getName());
            }
        });
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
