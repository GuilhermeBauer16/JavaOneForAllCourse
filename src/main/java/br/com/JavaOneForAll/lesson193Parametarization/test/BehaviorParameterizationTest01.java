package br.com.JavaOneForAll.lesson193Parametarization.test;

import br.com.JavaOneForAll.lesson193Parametarization.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorParameterizationTest01 {

    private static List<Car> cars = List.of(
            new Car(2011, "Green"), new Car(1998, "black"), new Car(2006, "red"));

    public static void main(String[] args) {
        System.out.println(filterCarsByColor(cars ,"red"));
    }

    private static List<Car> filterCarsByGreen(List<Car> cars){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars){
            if(car.getColor().equals("Green")){
                filteredCars.add(car);
            }

        }
        return filteredCars;
    }

    private static List<Car> filterCarsByColor(List<Car> cars , String color){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars){
            if(car.getColor().equals(color)){
                filteredCars.add(car);
            }

        }
        return filteredCars;
    }

    private static List<Car> filterCarsByYearBefore(List<Car> cars ,int year){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars){
            if(car.getYear() < year){
                filteredCars.add(car);
            }

        }
        return filteredCars;
    }
}
