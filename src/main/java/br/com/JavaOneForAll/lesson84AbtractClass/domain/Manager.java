package br.com.JavaOneForAll.lesson84AbtractClass.domain;



public class Manager extends Employee{

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculatedBonusSalary() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public void print() {

    }
}
