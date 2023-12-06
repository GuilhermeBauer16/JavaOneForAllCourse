package br.com.JavaOneForAll.lesson184Gererics.test;

import br.com.JavaOneForAll.lesson184Gererics.domain.Boat;
import br.com.JavaOneForAll.lesson184Gererics.domain.Car;
import br.com.JavaOneForAll.lesson184Gererics.service.BoatRentalService;
import br.com.JavaOneForAll.lesson184Gererics.service.CarRentalService;

public class GenericsClassesTest01 {

    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();
        Car car = carRentalService.retrieveAvailableCar();
        System.out.println("Using the car for entire month");
        carRentalService.returnRentCar(car);

        BoatRentalService BoatRentalService = new BoatRentalService();
        Boat boat = BoatRentalService.retrieveAvailableBoat();
        System.out.println("Using the boat for entire month");
        BoatRentalService.returnRentBoat(boat);
    }
}
