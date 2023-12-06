package br.com.JavaOneForAll.lesson90Polymorphism.test;

import br.com.JavaOneForAll.lesson90Polymorphism.repository.Repository;
import br.com.JavaOneForAll.lesson90Polymorphism.service.DatabaseRepositoryService;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new DatabaseRepositoryService();
        repository.save();
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Gui");
        listOfNames.add("John");
        listOfNames.add("Ana");
        System.out.println(listOfNames);
    }
}
