package br.com.JavaOneForAll.lesson90Polymorphism.test;

import br.com.JavaOneForAll.lesson90Polymorphism.domain.Computer;
import br.com.JavaOneForAll.lesson90Polymorphism.domain.Product;
import br.com.JavaOneForAll.lesson90Polymorphism.domain.Tomato;
import br.com.JavaOneForAll.lesson90Polymorphism.service.ProductTaxReportService;

public class ProductTest02 {

    public static void main(String[] args) {

        Product product = new Computer("Dell g15" , 5600);
        Tomato tomato = new Tomato("Italian", 10);
        tomato.setBestConsumedBefore("21/12/2021");
        ProductTaxReportService.generateTaxReport(tomato);
        ProductTaxReportService.generateTaxReport(product);
    }
}
