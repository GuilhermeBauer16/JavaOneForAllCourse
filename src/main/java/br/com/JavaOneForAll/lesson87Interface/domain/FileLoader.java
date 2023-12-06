package br.com.JavaOneForAll.lesson87Interface.domain;

public class FileLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("Loading data from file");
    }

    @Override
    public void remove() {
        System.out.println("Remove data from file");

    }

    @Override
    public void checkingPermission() {
        System.out.println("Checking permission in the file");
    }
}
