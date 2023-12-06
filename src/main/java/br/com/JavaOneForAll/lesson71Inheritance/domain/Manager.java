package br.com.JavaOneForAll.lesson71Inheritance.domain;

import java.io.StringReader;

public class Manager extends  Employee{
    private String departament;

    public Manager(String name, String socialSecurityNumber, Address address, double salary , String departament ){
        super(name,socialSecurityNumber,address,salary);
        this.departament = departament;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(this.departament);
        paymentReport();

    }

    public void paymentReport(){
        System.out.println("The employee " + this.getName() + " from the departament" +
                this.departament + " received a salary of " + this.getSalary());
    }


    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }
}
