package br.com.JavaOneForAll.lesson196Lambdas.test;

import br.com.JavaOneForAll.lesson196Lambdas.domain.Book;
import br.com.JavaOneForAll.lesson196Lambdas.service.BookComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(List.of(new Book("book", 12), new Book("laws", 43), new Book("rich dad", 100)));
        books.sort((book1, book2) -> book1.getTitle().compareTo(book2.getTitle()));
        books.sort((book1 , book2) -> BookComparators.compareByTitle(book1,book2));
        books.sort(BookComparators::compareByTitle);
        books.sort(BookComparators::compareByPrice);
        System.out.println(books);
    }
}
