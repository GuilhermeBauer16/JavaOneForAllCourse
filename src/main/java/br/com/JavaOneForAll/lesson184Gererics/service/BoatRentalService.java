package br.com.JavaOneForAll.lesson184Gererics.service;

import br.com.JavaOneForAll.lesson184Gererics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRentalService {

    private List<Boat> BoatsAvailable = new ArrayList<>(List.of(new Boat("Boat1") , new Boat("Boat2")));


    public Boat retrieveAvailableBoat(){
        System.out.println("search for any available Boat");
        Boat Boat = BoatsAvailable.remove(0);
        System.out.println("Renting the Boat: " + Boat);
        System.out.println("Available Boats to rent " + BoatsAvailable);
        return Boat;
    }

    public void returnRentBoat(Boat Boat){
        System.out.println("Returning the Boat: " + Boat);
        BoatsAvailable.add(Boat);
        System.out.println("Available Boats to rent " + BoatsAvailable);

    }
}
