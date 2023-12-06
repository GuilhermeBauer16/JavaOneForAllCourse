package br.com.JavaOneForAll.lesson64Association.domain;

public class School {
    private String name;
    private Professor[] professors;

    public School(String name) {
        this.name = name;
    }

    public School(String name, Professor[] professor) {
        this.name = name;
        this.professors = professor;
    }

    public void print(){

        System.out.println(this.name);

        if(this.professors == null){
            return;
        }

        for(Professor professor : professors){
            System.out.println(professor.getName());
    }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
