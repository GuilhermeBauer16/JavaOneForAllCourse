package br.com.JavaOneForAll.lesson196Lambdas.test;

import br.com.JavaOneForAll.lesson196Lambdas.domain.Book;
import br.com.JavaOneForAll.lesson196Lambdas.service.BookComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(List.of(new Book("book", 12), new Book("laws", 43), new Book("rich dad", 100)));
        BookComparators bookComparators = new BookComparators();
        books.sort(bookComparators::compareByPriceNonStatic);
        books.sort((book1 , book2) -> bookComparators.compareByPriceNonStatic(book1,book2));
        System.out.println(books);
    }
}
