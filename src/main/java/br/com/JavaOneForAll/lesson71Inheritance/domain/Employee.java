package br.com.JavaOneForAll.lesson71Inheritance.domain;

public class Employee {

    private String name;
    private String socialSecurityNumber;
    private Address address;
    private double salary;


    public Employee(String name, String socialSecurityNumber, Address address, double salary) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.address = address;
        this.salary = salary;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.socialSecurityNumber);
        System.out.println(this.salary);
        System.out.println(this.address.getStreet());
        System.out.println(this.address.getZipcode());

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
