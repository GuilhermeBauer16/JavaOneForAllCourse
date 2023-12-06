package br.com.JavaOneForAll.lesson184Gererics.service;

import br.com.JavaOneForAll.lesson184Gererics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRentalService {

    private List<Car> carsAvailable = new ArrayList<>(List.of(new Car("BMW") , new Car("Porsche")));


    public Car retrieveAvailableCar(){
        System.out.println("search for any available car");
        Car car = carsAvailable.remove(0);
        System.out.println("Renting the car: " + car);
        System.out.println("Available cars to rent " + carsAvailable);
        return car;
    }

    public void returnRentCar(Car car){
        System.out.println("Returning the Car: " + car);
        carsAvailable.add(car);
        System.out.println("Available cars to rent " + carsAvailable);

    }
}
