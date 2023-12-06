package br.com.JavaOneForAll.lesson84AbtractClass.domain;

public class Developer extends  Employee{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void calculatedBonusSalary() {
        this.salary = this.salary + this.salary * 0.1;
    }

    @Override
    public void print() {

    }
}
