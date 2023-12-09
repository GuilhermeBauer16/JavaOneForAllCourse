package br.com.JavaOneForAll.lesson196Lambdas.test;

import br.com.JavaOneForAll.lesson196Lambdas.domain.Book;
import br.com.JavaOneForAll.lesson196Lambdas.service.BookComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<BookComparators> bookComparatorsSupplier = () -> new BookComparators();
        Supplier<BookComparators> bookComparatorsSupplier2 = BookComparators::new;
        BookComparators bookComparators = bookComparatorsSupplier.get();
        List<Book> books = new ArrayList<>(List.of(new Book("book", 12), new Book("laws", 43), new Book("rich dad", 100)));
        books.sort(bookComparators::compareByPriceNonStatic);
        System.out.println(books);
        BiFunction<String,Integer,Book> bookBiFunction = (title, price) -> new Book(title,price);
        BiFunction<String,Integer,Book> bookBiFunction2 = Book::new;
        System.out.println(bookBiFunction.apply("my book" , 23));
    }
}
