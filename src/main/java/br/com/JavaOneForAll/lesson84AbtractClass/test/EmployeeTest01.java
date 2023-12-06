package br.com.JavaOneForAll.lesson84AbtractClass.test;

import br.com.JavaOneForAll.lesson84AbtractClass.domain.Developer;
import br.com.JavaOneForAll.lesson84AbtractClass.domain.Employee;
import br.com.JavaOneForAll.lesson84AbtractClass.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Developer developer = new Developer("John" , 4000);
        Manager manager = new Manager("Nami" , 5000);
        System.out.println(manager);
        System.out.println(developer);
    }
}
