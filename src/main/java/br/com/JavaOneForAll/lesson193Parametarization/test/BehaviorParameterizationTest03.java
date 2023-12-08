package br.com.JavaOneForAll.lesson193Parametarization.test;

import br.com.JavaOneForAll.lesson193Parametarization.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterizationTest03 {

    private static List<Car> cars = List.of(
            new Car(2011, "Green"), new Car(1998, "black"), new Car(2006, "red"));

    public static void main(String[] args) {

        List<Car> green = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> red = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBefore = filter(cars, car -> car.getYear() < 2015);
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        List<Integer> numbersLowerThanFive = filter(numbers, num -> num < 5);

        System.out.println(green);
        System.out.println(red);
        System.out.println(yearBefore);
        System.out.println(numbersLowerThanFive);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filtered.add(t);
            }

        }
        return filtered;
    }

}
