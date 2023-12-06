package br.com.JavaOneForAll.lesson87Interface.test;

import br.com.JavaOneForAll.lesson87Interface.domain.DataLoader;
import br.com.JavaOneForAll.lesson87Interface.domain.DatabaseLoader;
import br.com.JavaOneForAll.lesson87Interface.domain.FileLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkingPermission();
        fileLoader.checkingPermission();

    }
}
