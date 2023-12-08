package br.com.JavaOneForAll.lesson193Parametarization.test;

import br.com.JavaOneForAll.lesson193Parametarization.domain.Car;
import br.com.JavaOneForAll.lesson193Parametarization.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterizationTest02 {

    private static List<Car> cars = List.of(
            new Car(2011, "Green"), new Car(1998, "black"), new Car(2006, "red"));

    public static void main(String[] args) {

        List<Car> green = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> red = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBefore = filter(cars , car -> car.getYear() < 2015);

        System.out.println(green);
        System.out.println(red);
        System.out.println(yearBefore);
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> predicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (predicate.test(car)) {
                filteredCars.add(car);
            }

        }
        return filteredCars;
    }

}
