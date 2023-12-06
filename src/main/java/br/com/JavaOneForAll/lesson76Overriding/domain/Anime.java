package br.com.JavaOneForAll.lesson76Overriding.domain;

public class Anime {

    private String name;

    public Anime(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name: " + this.name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
