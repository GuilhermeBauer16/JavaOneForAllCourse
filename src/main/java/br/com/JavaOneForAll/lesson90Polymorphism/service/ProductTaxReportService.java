package br.com.JavaOneForAll.lesson90Polymorphism.service;

import br.com.JavaOneForAll.lesson90Polymorphism.domain.Product;
import br.com.JavaOneForAll.lesson90Polymorphism.domain.Tomato;

public class ProductTaxReportService {
    public static void generateTaxReport(Product product) {
        System.out.println("Starting the tax report");
        double taxValue = product.calculateTaxValue();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax value: " + taxValue);

        if (product instanceof Tomato) {
            Tomato tomato = (Tomato) product;
            System.out.println("best consumed before: " + tomato.getBestConsumedBefore());
        }
    }
}
