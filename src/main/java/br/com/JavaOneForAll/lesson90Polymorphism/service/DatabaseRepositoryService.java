package br.com.JavaOneForAll.lesson90Polymorphism.service;

import br.com.JavaOneForAll.lesson90Polymorphism.repository.Repository;

public class DatabaseRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in database");
    }
}
