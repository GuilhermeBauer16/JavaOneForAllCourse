package br.com.JavaOneForAll.lesson184Gererics.test;

import br.com.JavaOneForAll.lesson184Gererics.domain.Boat;
import br.com.JavaOneForAll.lesson184Gererics.domain.Car;
import br.com.JavaOneForAll.lesson184Gererics.service.BoatRentalService;
import br.com.JavaOneForAll.lesson184Gererics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericsClassesTest02 {

    public static void main(String[] args) {
        List<Boat> boatsAvailable = new ArrayList<>(List.of(new Boat("Boat1") , new Boat("Boat2")));
        List<Car> carsAvailable = new ArrayList<>(List.of(new Car("BMW") , new Car("Porsche")));
        RentalService<Boat> boatRentalService = new RentalService<>(boatsAvailable);
        RentalService<Car> carRentalService = new RentalService<>(carsAvailable);
        Boat boat = boatRentalService.retrieveAvailableObject();
        boatRentalService.returnRent(boat);
    }
}
