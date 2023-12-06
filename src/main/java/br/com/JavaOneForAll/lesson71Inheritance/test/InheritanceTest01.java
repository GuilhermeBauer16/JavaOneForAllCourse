package br.com.JavaOneForAll.lesson71Inheritance.test;

import br.com.JavaOneForAll.lesson71Inheritance.domain.Address;
import br.com.JavaOneForAll.lesson71Inheritance.domain.Employee;
import br.com.JavaOneForAll.lesson71Inheritance.domain.Manager;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address("12th Ave","12345");
//        address.setStreet();
//        address.setZipcode();

        Employee employee = new Employee("John","1234",address,1000.45);
//        employee.setAddress(address);
//        employee.setName("John");
//        employee.setSocialSecurityNumber("1234");
//        employee.setSalary(1000.45);

        employee.print();
        System.out.println("-------");

        Manager manager = new Manager("Ana","1224",address,10222.45,"IT");
//        manager.setName("Ana");
//        manager.setAddress(address);
//        manager.setSocialSecurityNumber("1224");
//        manager.setSalary(10222.45);
//        manager.setDepartament("IT");

        manager.print();

    }
}
