package br.com.JavaOneForAll.lesson87Interface.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    public default void checkingPermission(){
        System.out.println("Checking permission general");

    }

    public static void retrieveMaxDataSize(){
        System.out.println("Inside retrieveMaxDataSize in the interface ");

    }
}
