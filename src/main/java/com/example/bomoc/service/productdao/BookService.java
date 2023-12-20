package com.example.bomoc.service.productdao;

import com.example.bomoc.model.product.Product;
import com.example.bomoc.model.product.book.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAllBooks();

    Optional<Book> getBook(Book book);

    Book createProduct(Book book);
}