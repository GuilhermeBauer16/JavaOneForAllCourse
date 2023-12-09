package br.com.JavaOneForAll.lesson196Lambdas.service;

import br.com.JavaOneForAll.lesson196Lambdas.domain.Book;

public class BookComparators {

    public static int compareByTitle(Book book1 , Book book2){
        return book1.getTitle().compareTo(book2.getTitle());
    }

    public static int compareByPrice(Book book1 , Book book2){
        return Integer.compare(book1.getPrice(), book2.getPrice());
    }

    public int compareByPriceNonStatic(Book book1 , Book book2){
        return Integer.compare(book1.getPrice(), book2.getPrice());
    }
}
