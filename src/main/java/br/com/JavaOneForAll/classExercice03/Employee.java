package br.com.JavaOneForAll.classExercice03;

import java.util.*;

public class Employee {

    private String name;
    private int age ;
    private double salary;
    private double average ;

    private CreateParameter createParameter = new CreateParameter();

    public Employee newEmployee(){

        this.name = createParameter.createString("Name: ");
        this.age = createParameter.createInt("Age: ");
        this.salary = createParameter.createDouble("Current salary:U$ ");
        return  this ;

    }

    public void printEmployee(){

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary:U$ " + this.salary);
        System.out.println("Average:U$ " + this.average);

    }

    public double calculateSalaries(){
        double total = 0.0;

        int quantityToSalaries = createParameter.createInt("Type the quantity of salaries what to want calculate: ");
        for(int i = 0 ; i < quantityToSalaries ; i ++){
            double salaries = createParameter.createDouble("Salary n° %d U$: ".formatted(i + 1));
            total += salaries;
        }
        return this.average = total / quantityToSalaries ;
    }
}
