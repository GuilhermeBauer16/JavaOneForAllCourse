package br.com.JavaOneForAll.lesson90Polymorphism.test;

import br.com.JavaOneForAll.lesson90Polymorphism.domain.Computer;
import br.com.JavaOneForAll.lesson90Polymorphism.domain.Television;
import br.com.JavaOneForAll.lesson90Polymorphism.domain.Tomato;
import br.com.JavaOneForAll.lesson90Polymorphism.service.ProductTaxReportService;

public class ProductTest01 {

    public static void main(String[] args) {

        Television television = new Television("Samsung", 7000);
        Computer computer = new Computer("Nuc10i7", 10000);
        Tomato tomato = new Tomato("Italian", 5);
        ProductTaxReportService.generateTaxReport(computer);
        System.out.println("--------------------------------");
        ProductTaxReportService.generateTaxReport(tomato);
        System.out.println("---------------------------------");
        ProductTaxReportService.generateTaxReport(television);


    }
}
