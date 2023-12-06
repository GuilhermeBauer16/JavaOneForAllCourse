package br.com.JavaOneForAll.lesson84AbtractClass.domain;

public  abstract class Employee extends Person{

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculatedBonusSalary();
    }

    public abstract void calculatedBonusSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
