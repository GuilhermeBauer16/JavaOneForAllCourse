package br.com.JavaOneForAll.lesson184Gererics.service;

import br.com.JavaOneForAll.lesson184Gererics.domain.Boat;

import java.util.List;

public class RentalService<T> {

    private List<T> objectsAvailable;

    public RentalService(List<T> objectsAvailable) {
        this.objectsAvailable = objectsAvailable;
    }

    public T retrieveAvailableObject(){
        System.out.println("search for any available Boat");
        T t= objectsAvailable.remove(0);
        System.out.println("Renting the Boat: " + t);
        System.out.println("Available Boats to rent " + objectsAvailable);
        return t;
    }

    public void returnRent(T t){
        System.out.println("Returning the Boat: " + t);
        objectsAvailable.add(t);
        System.out.println("Available Boats to rent " + objectsAvailable);

    }
}
