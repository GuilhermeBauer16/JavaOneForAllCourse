package br.com.JavaOneForAll.lesson70exercices.domain;

public class Place {

    private String address;

    public Place(String address) {
        this.address = address;
    }

    public void print(){
        System.out.println("address: " + this.address);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
